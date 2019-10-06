import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A1177{
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int index = scan.nextInt();
		
		
		String s = "";
		for(long i = 0  ; i < index + 1 ; i ++) {
			s += "" + i;
		}
		/*System.out.println(s);
		String str = s.substring(1);
		System.out.println(str);
*/
		System.out.println(s.charAt(index));
    }
}