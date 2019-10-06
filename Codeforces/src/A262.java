import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class A262{
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		int max = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(scan.hasNextInt()) {
			arr.add(scan.nextInt());
		}
		int og = 0;
		for(int i = 0 ; i  < arr.size(); i ++) {
			int ba = special(arr.get(i));
			if(ba <= max) {
				og ++;
			
				
			}
		}
		System.out.println(og);
    }
	static int special(int n) {
		String s = "" + n;
		int c = 0;
		for(int i =0 ; i < s.length(); i ++) {
			if(s.charAt(i) == '4' || s.charAt(i) == '7') {
				c ++;
			}
		}
		return c;
	}
}