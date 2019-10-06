import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A750 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int party = scan.nextInt();
        int time = 240 - party;
        int c =0 ;
        int bint = 1;
      //  System.out.println(time);
        while(time-bint * 5 >= 0 ) {
        
        	time -= bint *5;
        	bint ++;
        	c++;
        }
        System.out.println(c>n? n : c);
        
    }
}