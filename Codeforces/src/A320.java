import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A320 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		long n = scan.nextLong();
		String ooga = n + "";
		if(ooga.contains("444")) {
			System.out.println("NO");
			System.exit(0);
		}
		while(ooga.contains("144")) {
			ooga = ooga.replaceFirst("144", "");
		}
		while(ooga.contains("14")) {
			ooga = ooga.replaceFirst("14", "");
		}
		for(int i =0 ; i < ooga.length(); i ++) {
			if(ooga.charAt(i) != '1') {
				System.out.println("NO");
				System.exit(0);
			}
		}
		System.out.println("YES");

	}
}
	/*	if(!magic(n)) {
			System.out.println("NO");
		}else {
			String temp = n + "";
			if(temp.contains("444")) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
	}
	static boolean magic(long n) {
		String s = n + "";
		for(int i = 0 ;i < s.length(); i ++) {
			if(s.charAt(i) != '1' && s.charAt(i) != '4') {
				return false;
			}
		}
		return true;
	}
}*/
