import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A50 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		int m = scan.nextInt();
		System.out.println((int)Math.floor(n*m/2));
	}
}