import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A939 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		int[] arr = new int[6000];
		int c =1;
		while(scan.hasNextInt()) {
			arr[c] = scan.nextInt();
			c++;
		}
		for(int i =1 ; i <=n; i ++) {
			if(arr[arr[arr[i]]] == i){
				System.out.println("YES");
				System.exit(0);
			}
		}
		System.out.println("NO");
		
		
		


		
	}
}
