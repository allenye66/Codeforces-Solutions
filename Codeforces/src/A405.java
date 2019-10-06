import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A405 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(scan.hasNextInt()) {
        	arr.add(scan.nextInt());
        	
        }
        Collections.sort(arr);
        for(int i =0 ; i < n; i ++) {
        	System.out.print(arr.get(i) + " ");
        }
    }
    
}