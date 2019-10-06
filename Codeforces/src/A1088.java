import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class A1088 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int x = scan.nextInt();
		int[] arr = new int[x];
		for (int i = 1; i <= x; i++) {
			arr[i - 1] = i;
		}
		int[] arr2 = new int[2];
		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[j] % arr[i] == 0 && arr[j] * arr[i] > x) {

					if (arr[i] / arr[j] < x) {
						arr2[0] = arr[i];
						arr2[1] = arr[j];

					}
				}

			}
		}
		if (arr2[1] == 0 || arr2[0] == 0) {
			System.out.println("-1");
		} else {
			System.out.println(arr2[0] + " " + arr2[1]);
		}
	}
}