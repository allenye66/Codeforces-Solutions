import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C1203 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		long[] arr = new long[n];
		int bint = 0;
		while (scan.hasNextLong()) {
			arr[bint] = scan.nextLong();
			bint ++;
		}
		
		long gcd = findGCD(arr, n);
		int c = 0;
		for(int i =1; i <= gcd; i++) {
			if(gcd % i == 0) {
				c ++;
			}
		}
		System.out.println(c);
		
		

	}

	static long gcd(long a, long b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
  

    static long findGCD(long arr[], long n) 
    { 
        long result = arr[0]; 
        for (int i = 1; i < n; i++) 
            result = gcd(arr[i], result); 
  
        return result; 
    } 
  

}
