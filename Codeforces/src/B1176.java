import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B1176 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		for(int i = 0 ; i < n ; i ++) {
			int length = scan.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int j = 0 ; j < length; j ++) {
				arr.add(scan.nextInt());
			}
		//	System.out.println(arr);
			Collections.sort(arr);
		//	System.out.println(arr);
			ArrayList<Integer> temp = new ArrayList<Integer>();

			int counter = 0;
			for(int k = 0 ; k < arr.size(); k ++) {
				if(arr.get(k) % 3 == 0) {
					counter++;
				}else {
					temp.add(arr.get(k));
				}
			}
			//System.out.println(counter + " " + arr);
			//System.out.println(temp);


			int onecounter = 0;
			int twocounter = 0;
			for(int l = 0; l < temp.size(); l ++) {
				if(temp.get(l) % 3 == 2) {
					twocounter++;
				}
				if(temp.get(l) % 3 == 1) {

					onecounter++;
				}
			}
		//	System.out.println("current one counter: " + onecounter);
		//	System.out.println("current two counter: "  + twocounter);
			int inCommon = Math.min(onecounter, twocounter);
			onecounter -= inCommon;
			twocounter -= inCommon;
			counter += inCommon;
			//System.out.println("current one counter: " + onecounter);
		//	System.out.println("current two counter: "  + twocounter);
			while(twocounter >= 3) {
					twocounter = twocounter - 3;
					counter++;
			}
			
			while(onecounter >= 3) {
					onecounter -= 3;
					counter++;
			}
			
	//		System.out.println("current one counter: " + onecounter);
	//		System.out.println("current two counter: "  + twocounter);

			System.out.println(counter);
			
			
			
		}

		
	}
}
