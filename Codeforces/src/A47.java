import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class A47 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i= 1 ; i < 500; i ++) {
			arr.add(i);
		}
	//	System.out.println(arr);
		
		int b = 0;
		for(int i =0 ; i < arr.size(); i ++) {
			b += arr.get(i);
			if(b == n) {
				System.out.println("YES");
				System.exit(0);
			}
		}
		System.out.println("NO");
	}
}