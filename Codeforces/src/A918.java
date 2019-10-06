import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A918 {
	static ArrayList<Integer> ooga = new ArrayList<Integer>();
	static int n;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		n = scan.nextInt();
		int a = 0;
		int b = 1;
		for(int i =0  ; i < n+1 ; i ++) {
			ooga.add(b);
			int sum = a + b;
			a = b;
			b = sum;
		}
		System.out.println(ooga);
		String result = "";
		for(int i =1 ; i < n+1; i ++) {
			if(ooga.contains(i)) {
				result += "O";
			}else {
				result += "o";
			}
		}
		System.out.println(result);
	}
	
}
