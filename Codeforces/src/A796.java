import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class A796 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int index = scan.nextInt();
        int dollars = scan.nextInt();
        int[] arr = new int[n];
        int t= 0;
        while(scan.hasNextInt()) {
        	arr[t] = scan.nextInt();
        	t++;
        }
       // System.out.println(Arrays.toString(arr));
        ArrayList<Integer> indexDiff = new ArrayList<Integer>();
        for(int i= 0; i < n; i ++) {
        	if(dollars >= arr[i] && arr[i] != 0) {
        		//System.out.println(arr[i] + " " + i);
        		indexDiff.add(Math.abs(index-i-1));
        	}
        //	System.out.println(indexDiff);
        }
     //   System.out.println(indexDiff);
        System.out.println(Collections.min(indexDiff)*10);
        
        
    }
}