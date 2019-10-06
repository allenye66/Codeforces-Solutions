import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A677 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int people = scan.nextInt();
		int maxHeight = scan.nextInt();
		int counter = 0;
		for(int i =0 ; i < people; i ++) {
			int num = scan.nextInt();
			if(num > maxHeight) {
				counter += 2;
			}else {
				counter ++;
			}
			
		}
		System.out.println(counter);

		

	}
}