import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A486 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        long n = scan.nextInt();
        if(n% 2 == 0) {
        	System.out.println(n/2);
        }else {
        	System.out.println(n/2-n);
        }
    }
}