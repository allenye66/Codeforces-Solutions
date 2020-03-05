import java.util.*;
import java.io.*;
public class A1283{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("/Users/allen/Desktop/Codeforces/txt.txt"));
		int n = scan.nextInt();
		for(int i =0 ;i < n; i ++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int minutesLeft = 60*(23-a) + (60-b);
			System.out.println(minutesLeft);
		}
	}

}