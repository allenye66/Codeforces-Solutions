import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A255 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		int chest = 0, biceps= 0, back =0 ;
		int i = 1;
		while(scan.hasNextInt()){
			if(i % 3 == 1) {
				chest += scan.nextInt();
			}else if(i % 3 ==2 ) {
				biceps += scan.nextInt();
			}else {
				back += scan.nextInt();
			}
			i ++;
		}
		
		
		//3 10 8
		
		
		int max = Math.max(chest, Math.max(biceps, back));
		if(max == chest) {
			System.out.println("chest");
		}else if(max == biceps) {
			System.out.println("biceps");
		}else {
			System.out.println("back");
		}
		
	}
}
