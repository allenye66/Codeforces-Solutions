import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A282{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
        int lines = scan.nextInt();
        int counter = 0;
        scan.nextLine();
        for(int i =0 ; i < lines ; i ++) {
        	String s = scan.nextLine();
        	if(s.contains("+")) {
        		counter ++;
        	}else {
        		counter --;
        	}
        }
        System.out.println(counter);
    }
	   
 
}
 