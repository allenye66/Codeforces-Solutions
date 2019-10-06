import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A520 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int length = scan.nextInt();
		scan.nextLine();
		String str = scan.nextLine();
		str = str.toLowerCase();
	//	System.out.println(str);
		ArrayList<String> ooga = new ArrayList<String>();
		for(int i =0 ; i <length ;  i ++) {
			if(!ooga.contains("" + str.charAt(i)))
			ooga.add("" + str.charAt(i));
		}
		if(ooga.size() == 26) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
}
