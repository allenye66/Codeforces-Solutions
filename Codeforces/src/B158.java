import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class B158{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
        int groups = scan.nextInt();
        int cars = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0 ;i < groups; i ++) {
        	int t = scan.nextInt();
        	if(t == 4) {
        		cars ++;
        	}else {
        		arr.add(t);
        	}
        }
        Collections.sort(arr);
       // System.out.println(arr);
        int ones = 0;
        int twos = 0;
        int threes = 0;
        for(int i =0 ; i < arr.size(); i ++) {
        	if(arr.get(i) == 1) {
        		ones ++;
        	}
        	if(arr.get(i) == 2) {
        		twos ++;
        	}
        	if(arr.get(i) == 3) {
        		threes ++;
        	}
        }
        
        // eliminate twos
        while(twos >= 2) {
        	twos -= 2;
        	cars ++;
        }
        int m = Math.min(ones, threes);
        ones -=m;
        threes -= m;
        cars += m;
        int m1 = Math.min(ones, twos);
        ones -=m1;
        twos -= m1;
        cars += m1;
        
        cars += twos + threes;
        System.out.println(cars);
        
       /* System.out.println(ones);
        System.out.println(twos);
        System.out.println(threes);
        */


    }
 
}
 