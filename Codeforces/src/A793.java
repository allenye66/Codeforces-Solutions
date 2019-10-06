import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A793 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		int diff = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(scan.hasNextInt()) {
			arr.add(scan.nextInt());
		}
		int smallest = Collections.min(arr);
		Collections.sort(arr);
		arr.remove(0);
		long sum =0;
		for(int i = 0; i < n-1; i ++) {
			if((arr.get(i)-smallest)%diff != 0) {
				System.out.println(-1);
				return;
			}
			sum += (arr.get(i)-smallest)/diff;
		}
		System.out.println(sum);
		
		
		
	}
}