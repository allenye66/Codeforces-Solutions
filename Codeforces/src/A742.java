import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
 
public class A742{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int[] arr = {6, 8, 4, 2};
        
    
        System.out.println( (n == 0) ? 1 : arr[n %4] );
        
    }   
}