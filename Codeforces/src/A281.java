import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
 
public class A281{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        String str = scan.nextLine();
        String cap = str.substring(0, 1).toUpperCase() + str.substring(1);    
        System.out.println(cap);
    }
}