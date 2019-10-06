import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class B1080 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int q = scan.nextInt();
		int sum = 0;
		int[] arrL = new int[q];
		int[] arrQ = new int[q];
		for (int i = 0; i < q; i++) {
			arrL[i] = scan.nextInt();

			arrQ[i] = scan.nextInt();

		}

		for (int i = 0; i < q; i++) {
			int x = arrL[i];
			int y = arrQ[i];
			if (x % 2 == 1 && y % 2 == 1) {
				sum = -y + (y - x) / 2;
			}
			if (x % 2 == 0 && y % 2 == 0) {
				sum = (y - x) / 2 * -1 + y;
			}
			if (x % 2 == 1 && y % 2 == 0) {

				sum = (y - x + 1) / 2;
			}
			if (x % 2 == 0 && y % 2 == 1) {
				sum = (y - x + 1) / 2 * -1;

			}

			System.out.println(sum);
			sum = 0;

		}
	}
}