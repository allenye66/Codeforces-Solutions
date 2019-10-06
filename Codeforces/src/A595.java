import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays
;public class A595 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int a = scan.nextInt();
		int b = scan.nextInt() ;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(scan.hasNextInt()) {
			arr.add(scan.nextInt());
		}
		//System.out.println(arr);
		int counter = 0;
		for(int i =0 ; i < arr.size() - 1; i +=2) {
		//	System.out.println("afsd" + arr.get(i) + " " + arr.get(i + 1));
			int n = arr.get(i) + arr.get(i + 1);
			if(n > 0) {
				counter ++;
			}
		}
		System.out.println(counter);
	
		
		
	}
}