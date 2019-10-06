import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A59 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		String s = scan.nextLine();
		String temp = s.toUpperCase();
		char[] s1 = s.toCharArray();
		char[] temp1 = temp.toCharArray();
		//System.out.println(Arrays.toString(s1));
		//System.out.println(Arrays.toString(temp1));
		int howManyLower = 0;
		for(int i =0 ; i < s.length(); i ++) {
			if(s1[i] != temp1[i]) {
				howManyLower++;
			}
		}
		if(howManyLower < (s.length() - howManyLower)) {
			System.out.println(temp);
		}else {
			System.out.println(s.toLowerCase());
		}
		

		
	}
}
