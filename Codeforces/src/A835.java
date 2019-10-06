import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A835 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		int p1 = scan.nextInt();
		int p2 = scan.nextInt();
		int a1 = scan.nextInt();
		int a2 = scan.nextInt();
		int a = (n * p1 + 2 * a1);
		int b = (n * p2 + 2 * a2);
		if(a == b) {
			System.out.println("Friendship");
			System.exit(0);
		}
		if(Math.max(a, b) == a) {
			System.out.println("Second");
		}else {
			System.out.println("First");
		}
	}
}