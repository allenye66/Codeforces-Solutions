 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class B200{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
        int a = scan.nextInt();
        double sum = 0;
        int c;
        for(int i = 0 ;i < a; i ++){
            c = scan.nextInt();
            sum += c;
        }
        
       System.out.println(sum / a);
    }
}