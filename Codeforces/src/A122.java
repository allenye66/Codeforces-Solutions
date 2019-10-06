import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A122{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	   Scanner scan = new Scanner(new File("txt"));
	   long n = scan.nextInt();
	   if(lucky(n)) {
		   System.out.println("YES");
		   System.exit(0);
		   
	   }
	   for(int i =1 ; i <= n;  i ++) {
		   if(n % i == 0 && lucky(i)) {
			   System.out.println("YES");
			   System.exit(0);
		   }
	   }
	   System.out.println("NO");


	   }
	   static boolean lucky(long n) {
		   String temp = n + "";
		   for(int i =0 ; i < temp.length(); i ++) {
			   if(temp.charAt(i) != '4' && temp.charAt(i) != '7') {
				   return false;
			   }
		   }
		   return true;
		   
	   }
	   
}