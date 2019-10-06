import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A599 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(scan.nextInt());
		arr.add(scan.nextInt());
		arr.add(scan.nextInt());
Collections.sort(arr);
		int houseTo1 = arr.get(0);
		int houseTo2 = arr.get(1);
		int storeToStore = arr.get(2);
		
		//h -> 1 
			//1->h->2
			//1->2->h
	
		System.out.println(Math.min(houseTo1 + houseTo1 + houseTo2+ houseTo2,houseTo1 + storeToStore + houseTo2));
		
	}
}
