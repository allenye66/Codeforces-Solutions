import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1138 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int amount = scan.nextInt();
		int[] sushi = new int[amount];
		int b = 0;
		while (scan.hasNext()) {
			sushi[b] = scan.nextInt();
			b++;
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int consecutive = 1;
		int j = 0;
		for (int i = 1; i < amount; i++) {
			
			if(sushi[i] == sushi[i - 1]) {
				consecutive ++;
			}else {
				arr.add(consecutive);
				consecutive = 1;
			}
		}
		//System.out.println(arr); 
		
		int bounter = 1;
		for(int i = amount-1; i >= 1;i --) {
			if(sushi[i] == sushi[i - 1]) {
				bounter ++;
			}else {
				break;
			}
		}
		arr.add(bounter);
	//	System.out.println(arr); 
		
		
		int max = Integer.MIN_VALUE;
		for(int i =0 ; i < arr.size()-1; i ++) {
			int temp = Math.min(arr.get(i), arr.get(i + 1));
			if(max < temp) {
				max = temp;
			}
		}
		System.out.println(max*2);
		//22211221111122
		
		//3 2 2 5 2
		//true false true false true
		

		
		
		


		
	}
}
