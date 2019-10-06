import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A791{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	        Scanner scan = new Scanner(new File("txt"));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int years = 0;
 
        while(a <= b){
            a *= 3;
            b *= 2;
            years ++;
            
            
        }
        System.out.println(years);
    }
}