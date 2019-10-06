import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class A556 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int n = Integer.parseInt(scan.nextLine());
		String str = scan.nextLine();
		int zero =0, one = 0;
		for(int i =0 ; i < n; i ++) {
			if(str.charAt(i) == '0') {
				zero ++;
			}else {
				one++;
			}
		}
		System.out.println(n-2*Math.min(zero, one));
	}
}