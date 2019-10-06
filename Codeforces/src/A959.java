import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A959 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int starting = Integer.parseInt(scan.nextLine());
		// 7,
		if(starting %2== 0) {
			System.out.println("Mahmoud");
		}else {
			System.out.println("Ehab");
		}
		
		
		
	}
}