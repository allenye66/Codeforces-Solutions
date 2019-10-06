import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class C1178{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int width = scan.nextInt();
        int height = scan.nextInt();
        long counter = 4;
        for(int i =1 ; i < height ; i ++) {
        	counter = counter * 2 % 998244353;
        }
        for(int i =1 ; i < width ; i ++) {
        	counter  = counter * 2 % 998244353;
        }
        
        System.out.println(counter);
 
 
    }
}