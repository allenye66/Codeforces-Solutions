import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A658 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int questions = scan.nextInt();
		int constant = scan.nextInt();
		ArrayList<Integer> values = new ArrayList<Integer>();
		ArrayList<Integer> time = new ArrayList<Integer>();
		for(int i =0 ;i < questions*2; i ++) {
			if(i < questions)
			values.add(scan.nextInt());
			else
			time.add(scan.nextInt());
		}
		//System.out.println(values);
		//System.out.println(time);
		int limak = 0;
		int ltimes = 0;
		for(int i =0 ; i < questions; i ++) {
			ltimes += time.get(i);
			if( (values.get(i) - ltimes * constant)>0)
			limak += values.get(i) - ltimes * constant;
		}
		int radesh = 0;
		int rtimes = 0;
		for(int i = questions -1 ; i >= 0; i --) {
			rtimes += time.get(i);
			if( (values.get(i) - rtimes * constant)>0)
			radesh += values.get(i) - rtimes * constant;
		}
		if(limak > radesh) {
			System.out.println("Limak");
		}else if (radesh > limak) {
			System.out.println("Radewoosh");
		}else {
			System.out.println("Tie");
		}
	//	System.out.println(limak);
//		System.out.println(radesh);


		

	}
}