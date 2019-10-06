import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A758{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
	    int n = scan.nextInt();
    	ArrayList<Integer> arr = new ArrayList<Integer>();

	    while(scan.hasNextInt()) {
			arr.add(scan.nextInt());
	    }
	    Collections.sort(arr);
	    int counter =0;
	    for(int i =0 ; i < arr.size() - 1; i ++) {
	    	int large = arr.get(arr.size() - 1);
	    	counter += large - arr.get(i);
	    }
	    System.out.println(counter);

    }
 
}
 