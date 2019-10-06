import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A1185 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int distance = scan.nextInt();
		
		int[] arr = { a, b, c};
		Arrays.sort(arr);
		
		int[] wanted = {arr[0], arr[0] + distance, arr[0] + distance * 2};
		
		int max = Integer.MIN_VALUE;
		for(int i =0 ; i < 3 ; i ++) {
			int temp = wanted[i] - arr[i];
			
			if(max < temp) {
				max = temp;
			}
		}
		System.out.println(max);


		
	}
}
