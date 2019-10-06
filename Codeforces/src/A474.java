import java.io.File;
import java.util.Map;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A474{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	   Scanner scan = new Scanner(new File("txt"));
	   String rorl = scan.nextLine();
	   String s = scan.nextLine();
	   String result = "";
	   String list = "qwertyuiopasdfghjkl;zxcvbnm,./";
	   if(rorl.equals("R")) {
		   for(int i =0 ;i < s.length(); i ++) {
			   result += list.charAt(list.indexOf(s.charAt(i))-1);
		   }
	   }else {
		   for(int i =0 ;i < s.length(); i ++) {
			   result += list.charAt(list.indexOf(s.charAt(i))+1);
		   }
	   }
	   System.out.println(result);

	}
}