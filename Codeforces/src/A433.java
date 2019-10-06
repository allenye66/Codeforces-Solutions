import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A433 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		int twos = 0;
		int ones = 0;
		while(scan.hasNextInt()) {
			if(scan.nextInt() == 200) {
				twos ++;
			}else {
				ones ++;
			}
		}
		if(twos % 2 == 0 && ones % 2== 0) {
			System.out.println("YES");
			System.exit(0);
		}
		if(twos % 2 == 1 && ones % 2 == 0 && ones > 1) {
			System.out.println("YES");
			System.exit(0);

		}
		System.out.println("NO");
		
		
		


		
	}
}
