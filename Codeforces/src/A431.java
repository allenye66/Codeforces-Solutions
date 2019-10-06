import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A431{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	   Scanner scan = new Scanner(new File("txt"));
	   int cal1 = scan.nextInt();
	   int cal2 = scan.nextInt();
	   int cal3 = scan.nextInt();
	   int cal4 = scan.nextInt();
	   scan.nextLine();
	   String s = scan.nextLine();
	   int counter = 0;
	   for(int i =0 ; i < s.length(); i++) {
		   if(s.charAt(i) == '1') {
			   counter += cal1;
		   }
		   if(s.charAt(i) == '2') {
			   counter += cal2;
		   }
		   if(s.charAt(i) == '3') {
			   counter += cal3;
		   }
		   if(s.charAt(i) == '4') {
			   counter += cal4;
		   }
	   }
	   System.out.println(counter);
	   
    }
}