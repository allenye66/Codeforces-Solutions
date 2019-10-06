import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A879 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int counter = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        for(int i =0 ; i < n; i ++) {
        	int a = scan.nextInt();
        	int b = scan.nextInt();
        	int g = b;
        	if(!arr.contains(arr) && a > arr.get(arr.size()-1)) {
        		arr.add(a);
        	}else {
        		while(a <= arr.get(arr.size()-1)) {
        			counter += g;
        			a += b;
        		}
        		arr.add(a);
        	}
        	//System.out.println(arr);
        }
        
        System.out.println(Collections.max(arr));
	}
	  
}
