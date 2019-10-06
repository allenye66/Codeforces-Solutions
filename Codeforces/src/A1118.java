import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1118 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int queries = scan.nextInt();
		for(int i =0 ; i < queries ; i ++)
		{
			long water = scan.nextLong();
			int one = scan.nextInt();
			int two = scan.nextInt();
			double o = one * 1.0;
			double t = two * 1.0;
			if(o < t/2) {
				System.out.println(one * water);
			}else {
				if(water % 2 == 0) {

					System.out.println(water /2 * two);
				}else {

					System.out.println(water/2 *  two + one);
				}
			}
		
		}
	}
}