import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class A501 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		//int v  = 3 * a/10;
		//int v2 = a - a/250 * b;
		//System.out.println(v + " " + v2);
		int misha = Math.max(3 * a/10, a - a/250 * c);
		int vasya = Math.max(3 * b/10, b - b/250 * d);
	//	System.out.println(vasya + " " + misha);
		if(vasya>misha) {
			System.out.println("Vasya");
		}else if (misha>vasya) {
			System.out.println("Misha");
		}else {
			System.out.println("Tie");
		}

	}
}