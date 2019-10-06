import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class A577 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		long first = scan.nextInt();
		long second = scan.nextInt();
		int counter = 0;
		
		
		for(int i = 1; i <= first; i ++) {
			if(second % i == 0 && second/i <= first) {
				counter ++;
				
			}
		}
		System.out.println(counter);

	}
	
}