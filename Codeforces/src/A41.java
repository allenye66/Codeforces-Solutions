import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A41 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		String str = scan.nextLine();
		String str1 = scan.nextLine();
		String reverse = "";
		for (int i = str.length() - 1; i > -1; i--) {
			reverse += str.charAt(i);
		}
		if (reverse.equals(str1)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}