import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1102 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
	
		int n = scan.nextInt();
		System.out.println((n % 4 == 0|| (n-3) % 4 == 0) ? 0 : 1);

	}
}