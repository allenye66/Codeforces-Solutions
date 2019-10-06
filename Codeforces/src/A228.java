import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A228 
{
    public static void main(String[] args) throws FileNotFoundException{
    	Scanner scan  = new Scanner(new File("txt"));
    	ArrayList<Long> arr = new ArrayList<Long>();
    	while(scan.hasNextLong()) {
    		arr.add(scan.nextLong());
    		
    	}
    	Collections.sort(arr);
		int c= 0;
    	for(int i =1  ; i < arr.size(); i++) {
    		String s = arr.get(i) + "";
    		String s2 = arr.get(i-1) + "";

    		if(s.equals(s2)) {
				c ++;
    		}
    	}
    	System.out.println(c);
    	
    	
    }
        
        
    
}