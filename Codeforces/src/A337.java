import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A337{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
	    int children = scan.nextInt();
	    int puzzles = scan.nextInt();
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    while(scan.hasNextInt()) {
	    	arr.add(scan.nextInt());
	    }
	    Collections.sort(arr);
	  //  System.out.println(arr);
	    int least = Integer.MAX_VALUE;
	    int n = children - 1;
	    for(int i =0 ; i < puzzles-n ; i ++) {
	    	int diff = arr.get(i + n) - arr.get(i);
	    //	System.out.println(arr.get(i + n)  + " " + arr.get(i));
	    	least = Math.min(least, diff);
	    }
	    System.out.println(least);
    }
	   
 
}
 