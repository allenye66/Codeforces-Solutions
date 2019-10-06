import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A1005 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int length = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int ones  = 0;
        ArrayList<Integer> stairIndex = new ArrayList<Integer>();
        int bounter = 0;
        while(scan.hasNextInt()) {
        	int n = scan.nextInt();
        	if(n == 1 ) {
        		if(ones != 0) {
        		stairIndex.add(bounter);
        		}
        		ones++;
        		
        	}
        	arr.add(n);
        	bounter ++;
        }
        stairIndex.add(0, 0);
        stairIndex.add((arr.size()));
        System.out.println(ones);
        for(int i =0 ; i < stairIndex.size()-1; i ++) {
        	System.out.print((stairIndex.get(i+1)-stairIndex.get(i))+ " ");
        }
      //  System.out.println(stairIndex);

        
    }
}