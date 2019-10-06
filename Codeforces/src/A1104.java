import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A1104 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if (n % 9 == 0) {
			while (n >= 9) {
				arr.add(9);
				n -= 9;
			}
		} else if (n % 8 == 0) {
			while (n >= 8) {
				arr.add(8);
				n -= 8;
			}
		} else if (n % 7 == 0) {
			while (n >= 7) {
				arr.add(7);
				n -= 7;
			}
		} else if (n % 6 == 0) {
			while (n >= 6) {

				arr.add(6);
				n -= 6;
			}
		} else if (n % 5 == 0) {
			while (n >= 5) {

				arr.add(5);
				n -= 5;
			}
		} else if (n % 4 == 0) {
			while (n >= 4) {

				arr.add(4);
				n -= 4;
			}
		} else if (n % 3 == 0) {
			while (n >= 3) {

				arr.add(3);
				n -= 3;
			}
		} else if (n % 2 == 0) {
			while (n >= 2) {

				arr.add(2);
				n -= 2;
			}
		} else if (n % 1 == 0) {
			while (n >= 1) {

				arr.add(1);
				n -= 1;
			}
		}
		System.out.println(arr.size());
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}

	}

}