import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class B1203 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int queries = scan.nextInt();
        for(int j = 0 ; j < queries; j ++) {
        	int sides = scan.nextInt();
        	
        	ArrayList<Long> arr = new ArrayList<Long>();
        	for(int i = 0 ;i < 4*sides; i ++) {
        		arr.add(scan.nextLong());
        	}
        	Collections.sort(arr);
        	if(ooga(arr)) {
        		System.out.println("YES");
        	}else {
        		System.out.println("NO" );
        	}
        	
        }
      
	}
	static boolean ooga(ArrayList<Long> arr) {
    	HashSet<Long> set = new HashSet<Long>();

		for(int i =0 ; i < arr.size()/2; i += 2) {
			set.add(arr.get(i) * arr.get(arr.size() - 1 - i));
		//	System.out.println(i + " " + (i + 1) + " " + (arr.size()-i-1) + " " + (arr.size() -i - 2) );
		//	System.out.println(arr);
		//	System.out.println(arr.get(i) + arr.get(arr.size()-i-1) + arr.get(i + 1) + arr.get( arr.size() -i - 2));
			if(set.size()> 1) {
				return false;
			}
			
		}
		return true;
	}
	  
}
