import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A1154{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    while(scan.hasNextInt()) {
	    	arr.add(scan.nextInt());
	    }
	    Collections.sort(arr);
	    
	    int a, b, c;
	    
	    //3, 4, 5, 6
	/*    c = 5 - b;
	    b = 3 - a
	    c = 5 - 3 + a
	    */
	    a  =(-1 * arr.get(2) + arr.get(0)+ arr.get(1))/2;
	    b = arr.get(0) - a;
	    c = arr.get(2) - b;
	    System.out.println(a + " " + b + " " +c );

	    
	    
 
        
    }
    
 
}