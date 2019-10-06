import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class A318 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        long n = scan.nextLong();
        long index = scan.nextLong();
        
 
		
			System.out.println((2*index <= n+1) ? (2*index-1):2 * (index- (long)Math.ceil(n/2.0)));
	
        /*
        if(n % 2 == 1 && index > n/2)
        	System.out.println(2*(index - n/2)-2  );
        else if(n % 2 == 0 && index > n/2)
            System.out.println(2*(index - n/2));
        else if(n % 2 == 1 && index <= n/2) 
        	System.out.println(2 * index - 1);
        else if(n % 2 == 0 && index <= n/2) 
        	System.out.println(2 * index -1);
		*/
    }
}