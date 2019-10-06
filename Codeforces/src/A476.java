import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A476{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	   Scanner scan = new Scanner(new File("txt"));
	   int n = scan.nextInt();
	   int multiple = scan.nextInt();
	   if(multiple > n) {
		   System.out.println(-1);
		   System.exit(0);
	   }
	   if(multiple == n) {
		   System.out.println(n);
		   System.exit(0);
	   }
	   System.out.println((((n+1)/2)+multiple-1)/multiple*multiple) ;

	   
    }
}