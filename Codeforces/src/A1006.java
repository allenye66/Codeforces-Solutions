import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class A1006 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        long n = scan.nextLong();
        ArrayList<Long> arr = new ArrayList<Long>();
        while(scan.hasNextLong()) {
        	arr.add(scan.nextLong());
        }
       
        for(int i = 0 ; i < arr.size(); i ++) {
        	if(arr.get(i) % 2 == 0) {
        		arr.set(i, arr.get(i)-1);
        	}
        	System.out.print(arr.get(i) + " ");
    
        }
        
        //System.out.println(arr);
        
        
    }
}