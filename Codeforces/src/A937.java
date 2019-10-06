import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A937 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(scan.hasNextInt()) {
			arr.add(scan.nextInt());
		}
		Collections.sort(arr);
		
		int counter =0;
		int currentMin = 0;
		for(int i =0 ;i < n; i ++) {
			if(arr.get(i)> currentMin) {
				counter ++;
				currentMin = arr.get(i);
			}
		}
		System.out.println(counter);
		


		
	}
}
