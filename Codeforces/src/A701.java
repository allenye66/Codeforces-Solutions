import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class A701 {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		
	
		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		
		int[] number = new int[n];
		String[] ooga = new String[n];
		
		for(int i =0 ; i < n ; i ++) {
			number[i] = scan.nextInt();
			String s = (i + 1) + "";
			ooga[i] = s;
		}

		final String[] letters = IntStream.range(0, number.length)
		        .mapToObj(i -> new BoostString(number[i], ooga[i])) 
		        .sorted(Comparator.comparingInt(b -> b.boost))         
		        .map(b -> b.str)                                       
		        .toArray(String[]::new); 
		Arrays.sort(number);
	//	System.out.println(Arrays.toString(number));
//		System.out.println(Arrays.toString(letter));
	//	System.out.println(Arrays.toString(letters));
		for(int i =0 ; i < n/2; i ++) {
			System.out.println(letters[i] + " "  + letters[n-1-i]);
		}

	}
	static class BoostString {
	    int boost;
	    String str;

	    public BoostString(int boost, String str) {
	        this.boost = boost;
	        this.str = str;
	    }
	    
	}
}
