import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class A678{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
	    long goal = scan.nextLong();
	    long factor = scan.nextLong();
	    long temp = 0;
	   
	    	temp = goal + Math.abs((goal % factor)-factor);
	    	
	    
	    System.out.println(temp);
    }
 
}
