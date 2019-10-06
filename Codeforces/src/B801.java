import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B801 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		String before = scan.nextLine();
		String after = scan.nextLine();
	
		for(int i =0 ; i < before.length(); i ++) {
			if(before.charAt(i) < after.charAt(i)) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(after);
			
		

		
	}
}
