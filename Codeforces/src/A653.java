import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class A653 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		Set<Integer> arr = new HashSet<Integer>();
		for(int i= 0 ; i < n ; i ++) {
			arr.add(scan.nextInt());
			
		}
		List<Integer> list = new ArrayList<Integer>(arr); 	
		Collections.sort(list);
		//System.out.println(arr);
		//System.out.println(list);
		int[] diff = new int[n-1];
		
		for(int i= 0 ; i < arr.size() -1; i ++) {
			diff[i] = list.get(i+1)-list.get(i)  ;	
		}
		
	//	System.out.println(Arrays.toString(diff));
		int c =0;
		for(int i = 0 ; i < diff.length-1; i ++) {
			if(diff[i] == 1 && diff[i + 1] == 1) {
				System.out.println("YES");
				System.exit(0);
			}
		}
	
			System.out.println("NO");

		
		
	}
}