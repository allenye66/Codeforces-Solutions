import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A270 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        
        int n = scan.nextInt();
        for(int i = 0 ; i < n; i ++) {
        	System.out.println(360%(180-scan.nextInt())==0?"YES":"NO");
        }
    }
    
}