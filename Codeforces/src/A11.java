import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A11 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int add = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(scan.hasNextInt()) {
        	arr.add(scan.nextInt());
        }
        int counter = 0;
        for(int i =0 ; i < arr.size()-1; i ++){
        	int a = arr.get(i + 1);
        	int b = arr.get(i);
        	if( a < b) {
        		System.out.println("ooga" + a + b);
        		while( a < b) {
        			a+= n;
        			counter ++;
        		}
            	arr.set(i + 1, a);
        	}
        	System.out.println(arr);
        }
   
        
    }
}