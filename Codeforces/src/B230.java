import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class B230{
	public static void main(String[] args) throws FileNotFoundException{

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		for(int i =0 ; i < n; i ++) {
			long a = scan.nextLong();
			System.out.println(isThreeDisctFactors(a)? "YES" : "NO");
		}
	}
	static boolean isPrime(int n)  
	{  
	    // Corner cases  
	    if (n <= 1)  
	        return false;  
	    if (n <= 3)  
	        return true;  
	  
	    // This is checked so that we can skip  
	    // middle five numbers in below loop  
	    if (n % 2 == 0 || n % 3 == 0)  
	        return false;  
	  
	    for (int i = 5; i * i <= n; i = i + 6)  
	        if (n % i == 0 || n % (i + 2) == 0)  
	            return false;  
	  
	    return true;  
	}  
	  
	// Function to check whether given number  
	// has three distinct factors or not  
	static boolean isThreeDisctFactors(long n)  
	{  
	    // Find square root of number  
	    int sq = (int)Math.sqrt(n);  
	  
	    // Check whether number is perfect  
	    // square or not  
	    if (1L * sq * sq != n)  
	        return false;  
	  
	    // If number is perfect square, check  
	    // whether square root is prime or  
	    // not  
	    return isPrime(sq) ? true : false;  
	}  
	



}