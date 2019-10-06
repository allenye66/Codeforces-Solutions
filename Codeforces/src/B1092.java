import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class B1092{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
		int[] arr = new int[scan.nextInt()];
	    for(int i =0 ; i < arr.length; i ++) {
	    	arr[i] = scan.nextInt();
	    }
	    Arrays.sort(arr);
	   // System.out.println(Arrays.toString(arr));
	    ArrayList<Integer> ooga = new ArrayList<Integer>();
	    for(int i =0 ; i < arr.length-1; i ++) {
	    	ooga.add(Math.abs(arr[i] - arr[i + 1]));
	    	i ++;
	    }
	   // System.out.println(ooga);
	    int bounter = 0;
        for(int i =0 ; i < ooga.size(); i ++) {
        	bounter += ooga.get(i);
        }
	    System.out.println(bounter);
    }
    
 
}