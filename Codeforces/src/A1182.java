import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A1182 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int width = scan.nextInt();
		if(width % 2 == 1) {
			System.out.println(0);
		}else {
			System.out.println((int)Math.pow(2, width/2));
		}
	}
}
