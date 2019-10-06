import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1186 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int people = scan.nextInt();
        int pens = scan.nextInt();
        int notebooks = scan.nextInt();
        if(people <= pens && people <= notebooks) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
	}
	  
}
