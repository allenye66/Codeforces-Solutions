import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A1070{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	   Scanner scan = new Scanner(new File("txt"));
	   int divisible = scan.nextInt();
	   double sum = scan.nextInt();
	   ArrayList<Integer> arr = new ArrayList<Integer>();
	   
	   for(int i =0 ; i < Integer.MAX_VALUE; i ++) {
		  long n = divisible * i;
		  if(sumDigits(n) == sum) {
			   System.out.println(n);
			   System.exit(0);
		   }
	   }
	   System.out.println(-1);
	
    }
	public static double sumDigits(long i) {
	    return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
	}
}