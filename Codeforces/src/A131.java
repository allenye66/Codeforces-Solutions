import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A131 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        String s = scan.nextLine();
        String allUpper = s.toLowerCase();
        int bounter = 0;
        for(int i =0 ; i < s.length(); i ++) {
        	if(s.charAt(i) != allUpper.charAt(i)) {
        		bounter ++;
        	}
        }
        if(bounter == s.length()) {
        	System.out.println((s.charAt(0) + "").toLowerCase() + allUpper.substring(1, s.length()).toLowerCase());
        	System.exit(0);
        }
        
        
        String checkUpper = s.substring(1, s.length());
        String compare = checkUpper.toLowerCase();
        int co = 0;
        for(int i =0 ; i < checkUpper.length(); i ++) {
        	if(checkUpper.charAt(i) != compare.charAt(i)) {
        		co++;
        	}
        }
        String firstChar = s.charAt(0) + "";
        String ooga = firstChar.toLowerCase();

        if(co ==checkUpper.length() && firstChar.equals(ooga)) { //first char is lower)
        	System.out.println(firstChar.toUpperCase() + compare);
        	System.exit(0);
        }
        System.out.println(s);
    }
}