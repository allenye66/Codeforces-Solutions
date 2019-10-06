import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A263 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int bint = 0;
		int cint = 0;
		for(int i = 0 ;i < 5; i ++) {
			String str = scan.nextLine();
			String s = str.replace(" ", "");
		//	System.out.println(s);
			for(int j = 0 ; j < 5; j ++) {
				if(s.charAt(j) == '1') {
					bint = i;
					cint = j;
					
				}
			}
		}
	//	System.out.println(bint + " " + cint);
		int counter = Math.abs(bint - 2) + Math.abs(cint - 2);
		System.out.println(counter);
		
	}
}
