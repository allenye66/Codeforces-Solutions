import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A1 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
          double l= scan.nextInt();
          double b= scan.nextInt();
          double s= scan.nextInt();
          System.out.println((long)(Math.ceil(l/s)*Math.ceil(b/s)));
    }
}