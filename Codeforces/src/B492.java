import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B492 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		int length = scan.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (scan.hasNextInt()) {
			arr.add(scan.nextInt());
		}
		if(n == 1) {
			System.out.println(Math.max((length - arr.get(0))/1.0, arr.get(0)/1.0));
			System.exit(0);
		}
		Collections.sort(arr);
		//System.out.println(arr);
		ArrayList<Double> diff = new ArrayList<Double>();

		for (int i = 0; i < arr.size()-1 ; i++) {
			double d = (arr.get(i+1) - arr.get(i))/2.0;
			diff.add(d);
			

		}
		if(arr.contains(0) && arr.contains(length))
			System.out.println(Collections.max(diff));
		else if(arr.contains(0)) {
			System.out.println(Math.max(Collections.max(diff), length - Collections.max(arr)));
		}else if(arr.contains(length)) {
			System.out.println(Math.max(Collections.max(diff), Collections.min(arr)));

		}else {
			System.out.println(Math.max(Collections.max(diff), Math.max(length  - Collections.max(arr), Collections.min(arr))));
		}
	}
}