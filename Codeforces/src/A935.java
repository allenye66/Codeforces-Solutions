import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A935 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = Integer.parseInt(scan.nextLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i =1 ; i < n; i ++ ) {
			if(n % i == 0) {
				arr.add(i);
			}
		}
		
		System.out.println(arr.size());
		
	}
}