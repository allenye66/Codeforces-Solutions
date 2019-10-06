import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A236 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		String s = scan.nextLine();
		ArrayList<String> ooga = new ArrayList<String>();
		for(int i =0 ; i < s.length(); i ++) {
			if(!ooga.contains("" + s.charAt(i))){
				ooga.add("" + s.charAt(i));
			}
		}
		if(ooga.size() % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		}else {
			System.out.println("IGNORE HIM!");
		}
		
	}
}
