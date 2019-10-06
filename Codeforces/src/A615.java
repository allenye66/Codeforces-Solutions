import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A615 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int m = scan.nextInt();
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = 0 ; i < m; i ++) {
        	int buh = scan.nextInt();
        	for(int j = 0 ; j < buh; j ++) {
            	arr.add(scan.nextInt());

        	}
        }
        for(int i =1 ; i <n+1;  i ++) {
        	if(!arr.contains(i)) {
        		System.out.println("NO");
        		System.exit(0);
        	}
        }
        System.out.println("YES");
	}
	  
}
