import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class D805 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        String s = scan.nextLine();
        int c  = 0;
        while(s.contains("ab")) {
        	s= s.replaceFirst("ab", "bba");
        	c++;
        }
        System.out.println(c % 10000007);

    }
}