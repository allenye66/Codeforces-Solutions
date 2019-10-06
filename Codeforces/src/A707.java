import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A707{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	   Scanner scan = new Scanner(new File("txt"));
	   int row = scan.nextInt();
	   scan.nextLine();
	   for(int i =0 ; i  < row; i ++) {
		   	String s = scan.nextLine();
		   	if(s.contains("C")||s.contains("M")||s.contains("Y")){
		   		System.out.println("#Color");
		   		System.exit(0);
		   	}

	   }
  		System.out.println("#Black&White");

    }
}