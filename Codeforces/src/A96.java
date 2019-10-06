import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A96 {
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
		String x = scan.nextLine();
		int counter = 0;

		for (int i = 0; i < x.length() - 6; i++) {
			if (x.substring(i, i + 1).equals(x.substring(i + 1, i + 2))
					&& x.substring(i + 1, i + 2).equals(x.substring(i + 2, i + 3))
					&& x.substring(i + 2, i + 3).equals(x.substring(i + 3, i + 4))
					&& x.substring(i + 3, i + 4).equals(x.substring(i + 4, i + 5))
					&& x.substring(i + 4, i + 5).equals(x.substring(i + 5, i + 6))
					&& x.substring(i + 5, i + 6).equals(x.substring(i + 6, i + 7))) {

				counter++;

			}
		}

		if (counter > 0) {

			System.out.println("YES");
		} else {
			System.out.println("NO");

		}

	}
}