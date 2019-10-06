import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1181 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		long a = scan.nextInt();
		long b = scan.nextInt();
		long price = scan.nextInt();
		long a1 = (a + b) / price;
		long b1 = a / price +  b/ price;
		    if(a1 == b1){
		        System.out.println((a + b)/price +  " 0");
		        System.exit(0);
		        
		 }
	
		System.out.println((a + b)/price  + " " + Math.min(( price - (a % price)),  price - (b%price)));

		
		
		
	}
}