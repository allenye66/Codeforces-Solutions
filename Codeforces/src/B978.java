import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B978 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = Integer.parseInt(scan.nextLine());
		String s = scan.nextLine();
		int result=0,count=0;
		for(int i=0;i<s.length();i++){
			if (s.charAt(i) == 'x')
				count++;
			else {
				count=0;
			}
			if (count==3){
				result++;
				count--;
			}
		}
		System.out.println(result);
	}
}