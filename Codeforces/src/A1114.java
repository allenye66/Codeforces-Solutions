import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A1114{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	        Scanner scan = new Scanner(new File("txt"));
        int andrew = scan.nextInt();
        int dmitry = scan.nextInt();
        int michael = scan.nextInt();
        int green = scan.nextInt();
        int purple = scan.nextInt();
        int black = scan.nextInt();

        
        if(andrew <= green ){ 
            green = green - andrew; 
            int sum = green + purple;
            if(dmitry <= green + purple){ 
                sum = sum - dmitry; 
                if(michael <= black + sum){ 
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        
        }
            System.out.println("NO");
        
       
 
        
    }
    
 
}