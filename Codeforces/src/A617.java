import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A617 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int location = scan.nextInt();
		int counter = 0;
		while(location >= 5) {
			location -= 5;
			counter ++;
		}
		while(location >= 4) {
			location -= 4;
			counter ++;
		}
		while(location >= 3) {
			location -= 3;
			counter ++;
		}
		while(location >= 2) {
			location -= 2;
			counter ++;
		}
		while(location >= 1) {
			location -= 1;
			counter ++;
		}
		System.out.println(counter);
		
		
	}
}
