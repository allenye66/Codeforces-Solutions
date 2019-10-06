import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1167 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int queries = scan.nextInt();
		for (int i = 0; i < queries; i++) {
			int length = scan.nextInt();
			scan.nextLine();
			String s = scan.nextLine();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int j = 0; j < length; j++) {
				arr.add(Integer.parseInt("" + s.charAt(j)));
			}

			//System.out.println(arr);
			if (!arr.contains(8) || arr.size() < 11) {
				System.out.println("NO");
			} else {

				System.out.println("index of 8: " + get8(arr) + " string length: " + arr.size());
				if ((arr.size() - get8(arr)) < 11) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}
			}

		}

	}

	static int get8(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == 8) {
				return i;
			}
		}
		return -1;
	}
}
