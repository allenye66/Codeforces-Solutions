import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A1196 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
	    int queries = scan.nextInt();
	    for(int i =0 ; i < queries ;i ++) {
	    	long a = scan.nextLong();
	    	long b = scan.nextLong();
	    	long c = scan.nextLong();
	    	
	    //	System.out.println(Math.ceil((double)(a + b)/2) + " " + Math.ceil((double)c /2));
	    	
	    	if(c % 2 == 0)
		    	System.out.println((a + b)/2 + (c /2));
	    	else
		    	System.out.println((a + b-1)/2 + ((c-1) /2)+1);


	    	
	    	
	    }
        
    }
}