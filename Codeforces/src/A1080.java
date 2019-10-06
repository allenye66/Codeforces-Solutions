import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1080 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		int k = scan.nextInt();

		double na = (double) (k);
		int red = 2 * n; // how many red sheets needed
		int green = 5 * n; // how many green sheets needed
		int blue = 8 * n; // how many blue sheets needed

		int r = red / k;
		if (red % k != 0) {
			r += 1;
		}
		int g = green / k;
		if (green % k != 0) {
			g += 1;
		}
		int b = blue / k;
		if (blue % k != 0) {
			b += 1;
		}

		System.out.println(r + g + b);

	}
}