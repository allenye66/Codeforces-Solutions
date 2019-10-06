import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A1203 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int queries = scan.nextInt();
		for (int j = 0; j < queries; j++) {
			int n = scan.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				int b = scan.nextInt();
				arr[i] = b;
			
			}
			int c = 0;
			for (int i = 1; i < n; i++) {
				if(Math.abs(arr[i]-arr[i-1])==1 ||Math.abs(arr[i]-arr[i-1])==(n-1)) {
					c ++;
				}
			}
			System.out.println( c == n-1 ? "YES" : "NO");

			
			

		}

	}

	

}