import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class A801{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        String s = scan.nextLine();
        int c = 0;
        while(s.contains("VK")) {
        	c++;
        	s = s.replaceFirst("VK", "XX");
        //	System.out.println(s);
        }
        if(s.contains("KK") || s.contains("VV")) {
        	c++;
        }
        System.out.println(c);
 
    }
    
}