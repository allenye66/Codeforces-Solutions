import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class A1197{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
	    int queries = scan.nextInt();
	    for(int i = 0; i < queries; i ++) {
	    	int bar = scan.nextInt();
	    	ArrayList<Integer> arr= new ArrayList<Integer>();
	    	for(int j =0 ; j <bar; j ++) {
	    		arr.add(scan.nextInt());
	    	}
	    	Collections.sort(arr);
	    	int base1 = arr.get(arr.size() - 1);
	    	int base2 = arr.get(arr.size() - 2);
	    
	    	int steps = arr.size()-2;
	    	int maxHeight = Math.min(base1, base2)-1;
	    	System.out.println(Math.min(steps, maxHeight));

	    }
    }
 
}
 