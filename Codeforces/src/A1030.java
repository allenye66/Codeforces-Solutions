import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1030 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int digits = scan.nextInt();

		for(int i =0 ; i < digits; i ++) {
			int n = scan.nextInt();
			//System.out.println(n);
			if(n == 1) {
				System.out.println("HARD");
				System.exit(0);
			}
		}
		System.out.println("EASY");
		
		
		
		
	}
}