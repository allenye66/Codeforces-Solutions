import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class B519{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        ArrayList<Integer> one = new ArrayList<Integer>();
        for(int i =0 ;i < n; i ++) {
        	one.add(scan.nextInt());
        }ArrayList<Integer> two = new ArrayList<Integer>();
        for(int i =0 ;i < n-1; i ++) {
        	two.add(scan.nextInt());
        }
        ArrayList<Integer> three = new ArrayList<Integer>();
        for(int i =0 ;i < n-2; i ++) {
        	three.add(scan.nextInt());
        }
     //   System.out.println(one);
      //  System.out.println(two);
       // System.out.println(three);
        Collections.sort(one);
        Collections.sort(three);
        Collections.sort(two);
     //   System.out.println(one);
    //      System.out.println(two);
     //    System.out.println(three);
        boolean ooga = true;
        
        for(int i =0 ; i < n-1; i ++) {
        	if(!(one.get(i)+"").equals(two.get(i)+"")) {
        		System.out.println(one.get(i));
        		ooga = false;
        		break;
        	}
        }
        if(ooga) {
        	System.out.println(Collections.max(one));
        }
        boolean booga = true;
        for(int i = 0; i < n-2; i ++) {
        	if(!(two.get(i)+"").equals(three.get(i)+"")) {
        		System.out.println(two.get(i));
        		booga = false;
        		break;
        	}
        }
        if(booga) {
        	System.out.println(Collections.max(two));
        }

 	
    }

}