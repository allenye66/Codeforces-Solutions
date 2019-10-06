import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1031 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int width = scan.nextInt();
		int length = scan.nextInt();
		int rings = scan.nextInt();
		int counter = 0;
		while(rings != 0) {
			counter += 2 * (width + length)-4 ;
			width -= 4;
			length -=4;
			rings --;
		}
		System.out.println(counter);
		
		
		
	}
}