import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A513 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int p1Points = scan.nextInt();
		int p2Points = scan.nextInt();
		int p1Take = scan.nextInt();
		int p2Take = scan.nextInt();
		if(p1Points > p2Points) {
			System.out.println("First");
		}else {
			System.out.println("Second");
		}
	}
}
 