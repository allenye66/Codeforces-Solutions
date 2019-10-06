import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A9{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	   Scanner scan = new Scanner(new File("txt"));
	   int n = Math.max(scan.nextInt(), scan.nextInt());
	   if(n == 1) {
		   System.out.println("1/1");
	   }else if(n == 2) {
		   System.out.println("5/6");
	   }else if( n == 3) {
		   System.out.println("2/3");
	   }else if(n == 4) {
		   System.out.println("1/2");
	   }else if(n == 5) {
		   System.out.println("1/3");
	   }else {
		   System.out.println("1/6");
	   }
    }
}