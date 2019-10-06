import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A716 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		int diff = scan.nextInt();
		if(n==1) {
			System.out.println(1);
			System.exit(0);
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(scan.hasNextInt()) {
			arr.add(scan.nextInt());
		}
		int counter =0;
		boolean allWork = true;
		for(int i =1 ; i < n; i ++) {
		//	System.out.println(arr.get(i+1) - arr.get(i));
			if((arr.get(i) - arr.get(i-1)) > diff) {
				allWork = false;
				counter = 1;
			}else {

				counter ++;
			}
			
		}
		System.out.println(allWork? n : counter);
	}
}
