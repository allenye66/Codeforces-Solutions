import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class A271{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	   Scanner scan = new Scanner(new File("txt"));
	   int n = scan.nextInt();
	   
	   for(int i = n+1; i <10000; i++ ) {
		   if(isDistinct(i)) {
			   
			   System.out.println(i);
			   System.exit(0);
		   }
	   }
	   
    }
	   static boolean isDistinct(int n) {
		   String s = n +"";
		   Set<Integer> set = new HashSet<Integer>();
		   for(int i =0 ; i < s.length(); i ++) {
			   set.add(Integer.parseInt(s.charAt(i) + ""));
		   }
		   if(set.size() == s.length()) {
			   return true;
		   }
		   return false;
	   }
}