import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A984 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(scan.hasNextInt()) {
			arr.add(scan.nextInt());
		}
		int bint = 0;
		Collections.sort(arr);
	//	System.out.println(arr);
		if(arr.size() % 2 == 1) {
			while(arr.size() !=1) {
				arr.remove(Collections.min(arr));
				arr.remove(Collections.max(arr));
			}
			System.out.println(arr.get(0));

		}else {
			while(arr.size() !=2) {
				arr.remove(Collections.min(arr));
				arr.remove(Collections.max(arr));
			}
			if(arr.get(0) < arr.get(1)) {
			System.out.println(arr.get(0));
			}else {
				System.out.println(arr.get(1));

			}

		}
		
	}
	
}