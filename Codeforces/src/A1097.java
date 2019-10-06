import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1097 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		String s = scan.nextLine();
		String needThis = "" + s.charAt(0);

		String needThis1 = "" + s.charAt(1);
		String temp = scan.nextLine();
		
		temp = temp.replaceAll(" " , "");
		ArrayList<String> arr = new ArrayList<String>();
		for(int i =0  ; i < temp.length(); i ++)
		arr.add("" + temp.charAt(i));
		
		if(arr.contains(needThis1) || arr.contains(needThis)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		//System.out.println(temp);
		//System.out.println(needThis);
		

	}
}