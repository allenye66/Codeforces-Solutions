import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A719 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(scan.hasNextInt()) {
        	arr.add(scan.nextInt());
        }
        

        //if the numbers keep increasing and the last one is not 15, then UP
        // if the numbers do not keep increasing and the last one is not 0, then down
        int second = arr.get(arr.size()-1);
        if(second == 15) {
        	System.out.println("DOWN");
        	System.exit(0);

        }
        if(second == 0) {
        	System.out.println("UP");
        	System.exit(0);

        }
        if(arr.size() == 1) {
        	System.out.println(-1);
        	System.exit(0);
        }
        int first = arr.get(arr.size()-2);
        //System.out.println(first + " " + second);
        if(first < second && second != 15) {
        	System.out.println("UP");
        	System.exit(0);
        	
        }else {
        	System.out.println("DOWN");
        	System.exit(0);

        }
        if(first > second && second != 0) {
        	System.out.println("DOWN");
        	System.exit(0);
        	
        }else {
        	System.out.println("UP");
        	System.exit(0);

        }
    }
  
}