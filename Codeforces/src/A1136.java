import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class A1136{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
	    int n = scan.nextInt();
	    ArrayList<Integer> starting = new ArrayList<Integer>();
	    ArrayList<Integer> ending = new ArrayList<Integer>();
	    for(int i = 0 ; i < n * 2; i ++) {
	    	if( i % 2 == 0) {
	    		starting.add(scan.nextInt());
	    	}else {
	    		ending.add(scan.nextInt());
	    	}
	    }
	    int pageNumber = scan.nextInt();
	    int counter = 0;
	    for(int i = 0 ; i < n ; i ++) {
	    	int s = starting.get(i);
	    	int e = ending.get(i);
	    	if(pageNumber <= e && pageNumber >= s) {
	    		System.out.println(n -counter);
	    	}else {
	    		counter ++;
	    	}
	    }
	    
    }
 
}
 