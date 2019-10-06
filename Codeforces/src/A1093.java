import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1093 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(scan.hasNextInt()) {
			arr.add(scan.nextInt());
		}
		//System.out.println(arr);
		for(int i =0 ; i < arr.size(); i ++) {
			int buh = arr.get(i);
			int counter = 0;
			while(buh >= 2) {
				buh -= 2;
				counter ++;
			}
			while(buh  >= 3) {
				buh -= 3;
				counter ++;
			}
			while(buh >= 4) {
				buh -= 4;
				counter ++;
			}
			while(buh  >= 5) {
				buh -= 5;
				counter ++;
			}
			while(buh  >= 6) {
				buh -= 6;
				counter ++;
			}
			while(buh  >= 7) {
				buh -= 7;
				counter ++;
			}
			
			

			System.out.println(counter);
		}
	}
}