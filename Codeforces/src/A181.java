import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A181 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int rows = scan.nextInt();
		int columns = scan.nextInt();
		scan.nextLine();
		int[] x = new int[3];
		int[] y = new int[3];
		int b = 0;
		for(int i =1 ; i < rows+1; i ++) {
			String s   = scan.nextLine();
			for(int j=1 ; j < columns+1; j++) {
				if(s.charAt(j-1) == '*') {
					x[b] = i;
					y[b] = j;
					b ++;
				}
			}
		}
	
	//	System.out.println(Arrays.toString(x));
	//	System.out.println(Arrays.toString(y));
		Arrays.sort(x);
		Arrays.sort(y);
	//	System.out.println(Arrays.toString(x));
	//	System.out.println(Arrays.toString(y));
		for(int i =0 ;i < x.length-1; i ++) {
			if(x[i] == x[i + 1]) {
				x[i] = -1;
				x[i + 1] = -1;
			}
		}
		for(int i =0 ;i < y.length-1; i ++) {
			if(y[i] == y[i + 1]) {
				y[i] = -1;
				y[i + 1] = -1;
			}
		}
		//System.out.println(Arrays.toString(x));
		//System.out.println(Arrays.toString(y));
		for(int i =0 ;i < x.length; i ++) {
			if(x[i] >=0) {
				System.out.print(x[i] + " ");
			}
		}
		for(int i =0 ;i < y.length; i ++) {
			if(y[i] >= 0) {
				System.out.print(y[i]);
			}
			
		}
		
	}
}
