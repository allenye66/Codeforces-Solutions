import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class A580 {
	public static void main(String[] args) throws FileNotFoundException {
 
		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		int[] arr = new int[n];
		int buh = 0;
		while (scan.hasNextInt()) {
			arr[buh] = (scan.nextInt());
			buh++;
		}
		int sum = 1;
		int max = 1;
 
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				max++;
				sum = Math.max(sum, max);
			} else {
				max = 1;
			}
 
		}
		System.out.println(sum);
 
	}
}