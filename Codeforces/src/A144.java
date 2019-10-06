import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A144 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(scan.hasNextInt()) {
			arr.add(scan.nextInt());
		}
		int largest = Collections.max(arr);
		int smallest = Collections.min(arr);
		int largeIndex =0;
		int smallIndex =0;
		for(int i =0 ; i < n ; i ++) {
			if(arr.get(i) == largest) {
				largeIndex = i;
				break;
			}
		}
		for(int i =n - 1 ; i >= 0 ; i --) {
			if(arr.get(i) == smallest) {
				smallIndex = i;
				break;
			}
		}
		//System.out.println(smallIndex + " " + largeIndex);
		if(smallIndex > largeIndex) {
			System.out.println((n-smallIndex) + largeIndex-1);
		}else if(smallIndex < largeIndex) {
			System.out.println(largeIndex + (n - smallIndex) -2);
		}
		
	}
}
