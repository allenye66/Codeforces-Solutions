import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1148 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int a = scan.nextInt();
		int b = scan.nextInt();
		int ab = scan.nextInt();
		long sum = ab * 2;
		if(a != b) {
			sum += Math.min(a, b) * 2 + 1;
		}else {
			sum += a + b;
		}

	
		System.out.println(sum);
	}
}