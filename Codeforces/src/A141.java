import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A141 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		String s = scan.nextLine() + scan.nextLine();
		char[] bar = s.toCharArray();
		Arrays.sort(bar);
		String ing = scan.nextLine();
		char[] car = ing.toCharArray();
		Arrays.sort(car);
		if(car.length != bar.length) {
			System.out.println("NO");
			System.exit(0);
		}
		for(int i =0 ; i < bar.length; i ++) {
			if(bar[i] != car[i]) {
				System.out.println("NO");
				System.exit(0);
			}
		}
		System.out.println("YES");
		
		
	}
}
