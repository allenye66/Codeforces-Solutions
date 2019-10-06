import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1143 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int doors = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int onecounter = 0, zerocounter =0;
		while(scan.hasNextInt()) {
			int n = scan.nextInt();
			if(n == 1) {
				onecounter ++;
			}else {
				zerocounter ++;
			}
			arr.add(n);
		}
		for(int i =0 ; i < arr.size(); i ++) {
			if(arr.get(i) == 1) {
				onecounter --;
			}else {
				zerocounter --;
			}
			if(onecounter == 0 || zerocounter == 0) {
				System.out.println(i + 1);
				System.exit(0);
			}
			
		}

	}
}