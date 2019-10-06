import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1159 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int length = scan.nextInt();
		scan.nextLine();
		String s = scan.nextLine();
		char[] arr = s.toCharArray();
		int min = 0;
		for(int i =0 ; i < length; i ++) {
			if(arr[i] == '-') {
				if(min > 0) {
					min --;
				}
			}else {
				min ++;
			}
		}
		System.out.println(min);
	}
}