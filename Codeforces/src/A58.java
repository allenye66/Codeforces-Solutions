import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class A58 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		String s = scan.nextLine();
		String hello = "hello";
		int t = 0;
		int counter = 0;
		int d = 0;
		int j = 0;

		for (int i = 0; i < 5; i++) {
			for (j = d; j < s.length();) {
				if (hello.charAt(i) == s.charAt(j)) {
					counter++;
					j++;
					d = j;
					break;
				}
				j++;
				d = j;
			}
			j = d;
		}
		if(counter == 5) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}