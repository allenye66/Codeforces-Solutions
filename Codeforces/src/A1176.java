import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1176 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int lines = scan.nextInt();
        scan.nextLine();
        for(int i =0 ; i < lines; i ++) {
        	long number = scan.nextLong();
        	int counter = 0;
        	while(number % 5 == 0) {

        		number = number *4;
        		number = number/ 5;
        		counter ++;
        	}
        	
        	while(number % 3  == 0) {

        		number = number *2;
        		number = number/ 3;
        		counter ++;
        	}
        	while(number % 2 == 0) {

        		number = number / 2;
        		counter ++;
        	}
        	
        	if(number == 1) {
        		System.out.println(counter);
        	}else {
        		System.out.println(-1);
        	}
        }
        
        
	}
	  
}
