import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class B1185 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		for(int i = 0 ; i < n ; i ++) {
			String original = scan.nextLine();
			String compare = scan.nextLine();
			boolean works = true;
			for(int j = 0 ; j < original.length() ; j ++) {
				if(!compare.contains(""+ original.charAt(i))) {
					works = false;
				}
			}
			if(works) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		
		}

		
	}
}
