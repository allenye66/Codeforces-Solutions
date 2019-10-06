import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1096 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int queries = scan.nextInt();
		for(int i =0 ; i < queries; i ++) {
			int inner = scan.nextInt();
			int outer = scan.nextInt();
			if(outer % inner == 0) {
				System.out.println(inner + " " + outer);
			}else {
				System.out.println(inner + " "  + outer * 2);
			}
		}
		
		


		
	}
}
