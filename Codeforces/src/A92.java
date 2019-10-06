import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class A92 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int cows = scan.nextInt();
		int chips = scan.nextInt();
		int chipsPerRound = 0;
		for(int i = 1; i < cows + 1; i ++) {
			chipsPerRound += i;
		}
		
		int remaining =   chips % chipsPerRound;

		for(int i =1; i < cows+1; i ++) {
			if(remaining>=i) {
				remaining -=i;
			}else {
				System.out.println(remaining);
				System.exit(0);
			}
		}
		System.out.println(0);
	}
}