import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A988 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));

		int n = scan.nextInt();
		int wanted = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		Set<Integer> set = new HashSet<Integer>();
		while (scan.hasNextInt()) {
			arr.add(scan.nextInt());
		}
		set.addAll(arr);
		System.out.println((set.size() >= wanted) ? "YES" : "NO");
		ArrayList<Integer> tempSet = new ArrayList<Integer>();
		tempSet.addAll(set);

		//System.out.println(tempSet);
		//System.out.println(arr);
		int printed = 0;
		if (set.size() >= wanted) {
			
			for (int j = 0; j < tempSet.size(); j++) {
				for (int i = 0; i < arr.size(); i++) {
					if(printed == wanted) {
						//System.out.println(printed);

						System.exit(0);
					}
					if (tempSet.get(j) == arr.get(i)) {
						System.out.print(i+1 + " ");
						printed ++;
						break;
					}
				}
			}
		//	System.out.println();
	//		System.out.println(printed);
	//		System.out.println(set.size());

			

		}

	}
}