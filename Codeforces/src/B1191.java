import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class B1191 {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		
	
		Scanner scan = new Scanner(new File("txt"));
		String t = scan.nextLine();
		t = t.replaceAll(" ", "");
		int[] number = new int[t.length()/2];
		String[] letter = new String[t.length()/2];
		int b1 = 0;
		int b2 = 0;
		for(int i =0 ; i < t.length() ; i ++) {
			if(i % 2 == 0) {
				number[b1] = Integer.parseInt("" + t.charAt(i));
				b1++;
			}else {
				letter[b2] = "" + t.charAt(i);
				b2++;
			}
		}
	
		final String[] letters = IntStream.range(0, number.length)
		        .mapToObj(i -> new BoostString(number[i], letter[i])) 
		        .sorted(Comparator.comparingInt(b -> b.boost))         
		        .map(b -> b.str)                                       
		        .toArray(String[]::new); 
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(letters));

		
		//sorted
		//System.out.println(Arrays.toString(number));
		//System.out.println( Arrays.toString(borted));// And return an array
		
		
		//koutsu is when there is the same 3 numbers and can be mixture or letters
		//shuntsu is when there is 3 sequential tiles same suit
		//draw at most 2 cards
		//when do you need to draw only 1 card
			//2 sequentail same tile
				//sort by the letters
			//2 same numbers
		
		boolean lettersSame = true;
		
		for(int i =0 ; i < letter.length-1; i ++) {
			if(!letters[i].equals(letters[i + 1])) {
				lettersSame = false;
			}
		}
		
		boolean sequential = true;
		boolean numbersSame = true;
		for(int i =0 ; i < number.length-1; i ++) {
			if(number[i] != number[i + 1]) {
				numbersSame = false;
			}
		}
		for(int i =0 ; i < number.length-1; i ++) {
			if(number[i] + 1 != number[i + 1]) {
				sequential = false;
			}
		}
		if(numbersSame == true) {
			System.out.println(0);
			System.exit(0);
		}
		if(sequential == true && lettersSame == true) {
			System.out.println(0);
			System.exit(0);
		}
		
	

		
		
		int counter = 0;
		int max = 0;
		for(int i = 0 ; i < number.length-1; i ++) {
			if(number[i] == number[i+1]) {
				counter ++;
			}
			if(max < counter) {
				max = counter;
			}
		}
		if(max == 2) {
			System.out.println(1);
			System.exit(0);
		}
		int counter1 = 0;
		for(int i = 0 ; i < number.length - 1; i ++) {
			int n = number[i];
			int n1 = number[i + 1];
			if(n + 1  == n1) {
				if(letters[i].equals(letters[i + 1])) {
					counter1 ++;
				}
			}
		}
		
		if(counter1 == 1) {
			System.out.println(1);
			System.exit(0);
		}
		System.out.println(counter1);
		System.out.println(2);
	
	
	    
		

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
