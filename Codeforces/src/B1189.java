	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;   


public class B1189 {
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static ArrayList<String> permutations = new ArrayList<String>();
	static ArrayList<String> good = new ArrayList<String>();

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Integer> result = new ArrayList<Integer>();
		Scanner scan = new Scanner(new File("txt"));
		int digits = scan.nextInt();

		for(int i =0 ; i < digits; i ++) {
			arr.add(scan.nextInt());
		}
		recursion(digits, 0 );
		System.out.println(permutations);
		for(int i =0 ; i < permutations.size() ; i ++) {

			boolean goodNumber = true;

			String s = permutations.get(i);
			System.out.println(s);
			if((Integer.parseInt("" + s.charAt(1)) + Integer.parseInt("" + s.charAt(s.length() - 1)) <= Integer.parseInt("" + s.charAt(0)))){
				goodNumber = false;
			}
			if((Integer.parseInt("" + s.charAt(0)) + Integer.parseInt("" + s.charAt(s.length() - 2)) <= Integer.parseInt("" + s.charAt(s.length() -1)))){
				goodNumber = false;
			}
			System.out.println(goodNumber);

			
			for(int j = 1; j <s .length() -1; j ++) {

				int currentNumber = Integer.parseInt("" + s.charAt(j));
				
				int before = Integer.parseInt("" + s.charAt(j-1));

				int after = Integer.parseInt("" + s.charAt(j+1));
				System.out.println("checking if " + before + " plus " + after + " is smaller than " + currentNumber);
				int sum = before + after;
			//	System.out.println("after: " + sum);
				if(currentNumber > (before + after)) {
					System.out.println("it is smaller");
					goodNumber = false;
	//				break;
				}

				
			}
			System.out.println(goodNumber);

			
			System.out.println("_____________________");
			System.out.println();
			System.out.println();
			System.out.println();


			
			
			if(goodNumber == true) {
				good.add(permutations.get(i));
			}
			
			
		}
		if(good.size() == 0) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
			for(int k =0 ; k < permutations.get(0).length(); k ++) {
				if(k != permutations.get(0).length() - 1) {
					System.out.print(permutations.get(0).charAt(k) + " ");
				}else{
					System.out.print(permutations.get(0).charAt(k));
				}
			}
		}
		

	}
	public static void recursion(int n, int answer) {
		
		if(n==0) {
			permutations.add("" + answer);
			System.out.println(answer);
			return;
		}
		for(int i =0 ; i < arr.size(); i ++) {
			if (!String.valueOf(answer).contains(""+arr.get(i))) {
				recursion(n-1, 10*answer+ arr.get(i));
			}
			
		}
    }


}
	
	

