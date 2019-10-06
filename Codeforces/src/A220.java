import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A220 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		int first = 0;
		int counter = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			
			arr[i] = scan.nextInt();
			
		}
		int[] arr1 = arr.clone();
		Arrays.sort(arr);
		for(int i =0 ; i < n; i ++) {
			if(arr[i] != arr1[i]) {
				counter ++;
			}
		}
		System.out.println(counter > 2 ? "NO" : "YES");
	}

}