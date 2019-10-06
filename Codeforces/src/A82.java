import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class A82{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
       int n = scan.nextInt();
       String[] arr = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
       System.out.println();
       while(n > 5) {
    	   n-=5;
    	   n= (n+1)/2;
       }
       System.out.println(arr[n-1]);

    }
 
}
 