import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A1194 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int queries = scan.nextInt();
        for(int i =0 ; i < queries; i ++) {
        	long number = scan.nextInt();
        	int position = scan.nextInt();    
        	System.out.println(2*(position - 1) + 2); 	

        }
    }
}