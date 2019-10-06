import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A996 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int counter = 0;
        while(n != 0) {
        	while (n >= 100) {
                //System.out.println(100);

        		n -= 100;
        		counter ++;
        	}
        	while (n >= 20) {
                //System.out.println(20);

        		n -= 20;
        		counter ++;
        	}
        	while (n >= 10) {
               // System.out.println(10);

        		n -= 10;
        		counter ++;
        	}
        	while (n >= 5) {
             //   System.out.println(5);

        		n -= 5;
        		counter ++;
        	}
        	while (n >= 1) {
           //     System.out.println(1);

        		n -= 1;
        		counter ++;
        	}
        }
        System.out.println(counter);
	}
	  
}
