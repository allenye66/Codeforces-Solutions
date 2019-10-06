import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A621 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        ArrayList<Long> arr = new ArrayList<Long>();
        while(scan.hasNextLong()) {
        	arr.add(scan.nextLong());
        }

//        System.out.println(arr);
        long total = 0;
        for(int i= 0 ; i < n; i ++) {
        	total += arr.get(i);
        }
        
        if(total%2 == 0) {
        	System.out.println(total);
        	System.exit(0);
        }


        ArrayList<Long> odds = new ArrayList<Long>();
        for(int i =0 ; i < n ; i ++) {
        	if(arr.get(i) % 2 == 1) {
        		odds.add(arr.get(i));
        	}
        } 
        Collections.sort(odds);
        long min = Collections.min(odds);
        System.out.println(total - min);
       
        
        
        }
}