import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A1015 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int coordinates = scan.nextInt();
        int upper = scan.nextInt();
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();
        ArrayList<Integer> ooga = new ArrayList<Integer>();
        int bint = 0;
        while(scan.hasNextInt()) {
        	int temp = scan.nextInt();
        	if(bint % 2 == 0) {
        		first.add(temp);
        	}else {
        		second.add(temp);
        	}
        	bint++;
        }
      //  System.out.println(first);
     //   System.out.println(second);
        for(int i =0 ; i < coordinates; i ++) {
        	//if(first.get(i) != second.get(i)) {
        		for(int j = first.get(i); j <= second.get(i); j ++) {
        			//System.out.println(first.get(i) + " " + second.get(i));
        			if(!ooga.contains(j))
        			ooga.add(j);
        		}
        	/*}else {
        		ooga.add(first.get(i));
        	}
        	*/
        }
        Collections.sort(ooga);
       // System.out.println(ooga);
        
        System.out.println(upper - ooga.size() );
        for(int i = 1 ; i <= upper; i ++) {
        	if(!ooga.contains(i) && i != upper) {
        		System.out.print(i + " ");
        	}else if(!ooga.contains(i)) { 		
        		System.out.print(i);
        	}
        	
        }

    }
}