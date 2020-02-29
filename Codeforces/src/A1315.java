import java.util.*;
import java.io.*;
public class A1315{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("/Users/allen/Desktop/Codeforces/txt.txt"));
		int n = scan.nextInt();
		for(int i =0 ; i < n ; i ++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();

			
			int area1 = x * b;
			int area2 = y * a;
			int area3 = (a-x-1)*b;
			int area4 = (b-y-1)*a;

			area1 = Math.max(area1, area2);
			area3 = Math.max(area3, area4);
			System.out.println(Math.max(area1, area3));

		}

	}
}