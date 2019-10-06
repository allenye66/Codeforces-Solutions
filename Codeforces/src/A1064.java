import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A1064 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int[] arr = {scan.nextInt(), scan.nextInt(), scan.nextInt()};
		Arrays.sort(arr);
		if((arr[0] + arr[1]) > arr[2]) {
			System.out.println(0);
			System.exit(0);
		}
		int bint = arr[0] + arr[1];
		int counter = 0;
		while(bint < arr[2]) {
			bint ++;
			counter ++;

		}
		System.out.println(counter + 1);
	}
}
