import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A61{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	   Scanner scan = new Scanner(new File("txt"));
	   String one = scan.nextLine();
	   String two = scan.nextLine();
	   String result = "";
	   for(int i =0 ; i < one.length(); i ++) {
		   if(one.charAt(i) != two.charAt(i)) {
			   result += "1";
		   }else {
			   result += "0";
		   }
	   }
	   System.out.println(result);
	   
    }
}