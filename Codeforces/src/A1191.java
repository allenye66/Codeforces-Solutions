import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1191 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		//3
		if(n%4 ==1 ) {
			System.out.println("0 A");
			System.exit(0);
		}
		
		//4
		else if(n%4 == 0) {
			System.out.println("1 A");
			System.exit(0);

		}
		//7
		else if(n % 4 == 3) {
			System.out.println("2 A");
			System.exit(0);
			
		}
		//6
		else if(n % 4 == 2) {
			System.out.println("1 B");
			System.exit(0);
			
		}
		
		
		
		
	}
}