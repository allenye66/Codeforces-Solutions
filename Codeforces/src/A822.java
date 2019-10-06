import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A822 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		
		
		int c = 1;
		for(int i =1 ; i <= Math.min(a, b); i ++) {
			c*= i;
		}
		System.out.println(c);
		
	}
}
