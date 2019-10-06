import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class A782 {
	public static void main(String[] args) throws FileNotFoundException{	

		Scanner scan = new Scanner(new File("txt"));
		
		int n = scan.nextInt();
		
		String[] arr = new String[n*2];
		
		for(int i =0 ; i < n*2; i ++) {
			arr[i] = scan.nextInt() + "";
		}
		int max = 0;
		//System.out.println(Arrays.toString(arr));
		HashSet<String> set = new HashSet<String>();
		
		for(int i =0 ;i < arr.length; i ++) {
			if(!set.contains(arr[i])) {
				set.add(arr[i]);

			}else {
				set.remove(arr[i]);

			}
//			System.out.println(set);

			max = Math.max(set.size(), max);


		}
		System.out.println(max);

	}
}