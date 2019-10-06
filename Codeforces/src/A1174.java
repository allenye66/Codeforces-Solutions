import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A1174{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(scan.hasNextInt()) {
        	arr.add(scan.nextInt());
        }
       // System.out.println(arr);
        Collections.sort(arr);
        int sum1 = 0;
        int sum2 = 0;
        for(int i =0 ; i < n ; i ++) {
        	sum1 += arr.get(i);
        }
        for(int i =n ; i < n*2 ; i ++) {
        	sum2 += arr.get(i);
        }
        if(sum2 == sum1) {
        	System.out.println("-1");
        }else {
        	for(int i =0 ; i < arr.size(); i ++) {
        		if(i != arr.size() - 1)
        		System.out.print(arr.get(i) + " ");
        		else {
            		System.out.print(arr.get(i));

        		}
        		
        	}
        }
    }
 
}
 