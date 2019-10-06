import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A231 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int lines = scan.nextInt();
		int counter = 0;
		for(int i = 0 ; i < lines; i ++) {	
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if((a + b + c) >= 2) {
				counter ++;
			}
		}

		System.out.println(counter);

		
	}
}
