import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A313 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		if( n >= 0) {
			System.out.println(n);
			System.exit(0);
		}
		System.out.println(Integer.max(n/10, n/100*10+n%10));

	}
}