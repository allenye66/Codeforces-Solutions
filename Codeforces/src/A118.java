import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A118 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		String str = scan.nextLine().toLowerCase();
		String asdfgh = str.replace("y", "");
		String asdfg = asdfgh.replace("a", "");
		String asdf = asdfg.replace("e", "");
		String asd = asdf.replace("i", "");
		String as = asd.replace("o", "");
		String a = as.replace("u", "");

		String b = "";
		int length = a.length() * 2;
		int i = 0;
		while (b.length() < length) {
			b += "." + a.substring(i, i + 1);
			i++;
		}

		System.out.println(b);

	}
}