import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A994 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int first = scan.nextInt();
        int second = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> combo = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i= 0; i < first; i ++) {
        	list.add(scan.nextInt());
        }
        for(int i= 0; i < second; i ++) {
        	combo.add(scan.nextInt());
        }
       // System.out.println(list);
        //System.out.println(combo);
       
        for(int j = 0 ; j < list.size(); j ++) {
    		int compare = list.get(j);
    		//System.out.println(compare);
    		for(int i = 0 ; i < combo.size(); i ++) {
        		if(combo.get(i) == compare) {
        		//	System.out.println("found" + j);
            		System.out.print(compare + " ");
            		
            	}

            	
            }
        }
        

    }
}