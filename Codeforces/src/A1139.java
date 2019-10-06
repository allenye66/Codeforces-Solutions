import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1139 {
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static ArrayList<Integer> result = new ArrayList<Integer>();

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int digits = Integer.parseInt(scan.nextLine());
		String s = scan.nextLine();
		char[] bar = s.toCharArray();
		for(int i =0 ; i < bar.length; i ++) {
			arr.add(Integer.parseInt("" + bar[i]));
		}
		//System.out.println(arr);
		
		int counter = 0;
		
		for(int i = 0 ; i < arr.size(); i ++) {
			if(arr.get(i)%2 == 0) {
				counter += i  + 1;
			}
		}
		System.out.println(counter);
		/*
		for(int i =0 ; i < digits; i ++) {
			arr.add(Integer.parseInt(""+ s.charAt(i)));
		}
		for(int i =0 ; i < digits; i ++) {
			result.add(arr.get(i));
		}
		for(int i =0 ; i < digits-1; i ++) {
			result.add(Integer.parseInt("" + arr.get(i) + arr.get(i + 1)));
		}
		for(int i =0 ; i < digits-2; i ++) {
			int n = Integer.parseInt("" + arr.get(i) + arr.get(i + 1) + arr.get(i + 2));
			result.add(n);
		}
		for(int i =0 ; i < digits-3; i ++) {
			int n = Integer.parseInt("" + arr.get(i) + arr.get(i + 1) + arr.get(i + 2) + arr.get(i + 3));
			result.add(n);
		}
		
		for(int i =1 ; i < arr.size() - 1; i ++) {
			recursion(i , "", 0);
		}
		System.out.println(result);

		

	

	}
	
	static void recursion(int length, String s, int index) {
		if(length == 0) {
			System.out.println(s);
			result.add(Integer.parseInt(s));
			return;
		}
		recursion(length - 1, s + arr.get(index), index + 1 );
	}*/
	}
	
}