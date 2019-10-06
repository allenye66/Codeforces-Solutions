import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A1081{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	   Scanner scan = new Scanner(new File("txt"));
	   int n = scan.nextInt();
	   if(n == 2) {
		   System.out.println(2);
	   }else {
	   System.out.println(1);
	   }
    }
}