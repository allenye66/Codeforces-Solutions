import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A703 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		ArrayList<Integer> m = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		int buh = 0;
		while(scan.hasNextInt()) {
			if(buh%2 == 0) {
				m.add(scan.nextInt());
			}else {
				c.add(scan.nextInt());
			}
			buh ++;
		}
	//	System.out.println(m);
		//System.out.println(c);

		int chris = 0;
		int misha =0;
		for(int i = 0 ; i < n ; i ++) {
			if(c.get(i)>m.get(i)) {
				chris ++;
			}else if(c.get(i)<m.get(i)) {
				misha ++;
			}
		}
	//	System.out.println(chris + " " + misha);
		if(chris == misha) {
			System.out.println("Friendship is magic!^^");
			System.exit(0);
		}if(chris > misha) {
			System.out.println("Chris");

		}else {
			System.out.println("Mishka");
		}
		
	}
}
