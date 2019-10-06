import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class A440 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int[] arr  = new int[n-1];
        for(int i =0 ; i < n-1 ; i ++) {
        	arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));
        if(arr[arr.length - 1] != n) {
        	System.out.println(n);
        	System.exit(0);
        }
        if(arr[0] != 1) {
        	System.out.println(1);
        	System.exit(0);
        }
        for(int i =0 ; i < n ; i ++) {
        	if(arr[i] + 1 != arr[i + 1]) {
        		System.out.println(arr[i] + 1);
        		System.exit(0);
        	}
        }
    }
}