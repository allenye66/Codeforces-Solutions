import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A749{
    public static void main(String[] args) throws FileNotFoundException{
    	Scanner scan = new Scanner(new File("txt"));
		long n = scan.nextLong();
		
		if(n == 2) {
			System.out.println(1);
			System.out.println(2);
			System.exit(0);
		}
		if(n == 3) {
			System.out.println(1);
			System.out.println(3);
			System.exit(0);
		}
		if(n % 2 == 1) {
		System.out.println((n-3)/2 + 1);
		System.out.print("3 ");
		for(int i =0 ; i < (n-3)/2; i ++){
			System.out.print("2 ");
			}
		}else {
			System.out.println(n/2);
			for(int i =0 ; i < n/2; i ++){
				System.out.print("2 ");
			}
		}
		
    }
 
 
	
}