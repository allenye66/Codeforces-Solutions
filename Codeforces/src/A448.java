import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A448 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int cups = scan.nextInt() + scan.nextInt()+ scan.nextInt();
		int medals = scan.nextInt() + scan.nextInt() + scan.nextInt();
		int shelves = scan.nextInt();
		System.out.println((((cups+4)/5+(medals+9)/10)<=shelves)?"YES":"NO");
		}
}