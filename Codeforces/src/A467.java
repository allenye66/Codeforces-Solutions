import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A467 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int c = 0;
        for(int i =0 ; i < n; i ++) {
        	int a = scan.nextInt();
        	int b = scan.nextInt();
        	if(a <= (b-2)) {
        		c ++;
        	}
        	
        }
        System.out.println(c);
        
    }
}