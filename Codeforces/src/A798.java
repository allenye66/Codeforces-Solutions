import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A798 
{
	public static void main(String[] args) throws FileNotFoundException{

		Scanner scan = new Scanner(new File("txt"));

		String s = scan.nextLine();
		int sum =0;
		if(s.length() % 2 == 0) {
			for(int i =0 ; i < s.length()/2; i ++) {
				if(s.charAt(i) != s.charAt(s.length() - i -1)) {
					sum ++;
				}
				//System.out.println("comparing " + s.charAt(i) + " to " + s.charAt(s.length() - 1 -i) );
			}
			System.out.println(sum == 1 ? "YES" : "NO");
		}else {
			for(int i =0 ; i < s.length()/2; i ++) {
				if(s.charAt(i) != s.charAt(s.length() - i -1)) {
					sum ++;
				}
		//		System.out.println("comparing " + s.charAt(i) + " to " + s.charAt(s.length() - 1 -i) );
			}
			System.out.println(sum == 0 || sum == 1 ? "YES" : "NO");
		}
	}

}