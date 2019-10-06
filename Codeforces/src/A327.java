import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A327 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(scan.hasNextInt()) {
        	arr.add(scan.nextInt());
        }
        //segment that has more ones than zeroes
        int ones = 0;
        int zeroes = 0;
        int c = -1;
        for(int i =0 ; i < arr.size(); i++) {
        	if(arr.get(i) ==1) {
        		ones ++;
        		if(zeroes > 0) {
        			zeroes --;
        		}
        	}else {
        		zeroes ++;
        		if(zeroes > c) {
        			c = zeroes;
        		}
        	}
        }
        System.out.println(ones + c);

    }
}