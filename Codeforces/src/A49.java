import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A49 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		String str = scan.nextLine();
		String s = str.toUpperCase();
		s = s.replaceAll("[^a-zA-Z0-9]", "");

		if(s.charAt(s.length() - 1) == 'A' ||s.charAt(s.length() - 1) == 'E' ||s.charAt(s.length() - 1) == 'I' ||s.charAt(s.length() - 1) == 'O' ||s.charAt(s.length() - 1) == 'U' ||s.charAt(s.length() - 1) == 'Y' ) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}