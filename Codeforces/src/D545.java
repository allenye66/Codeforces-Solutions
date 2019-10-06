import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class D545 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int[] arr = new int[scan.nextInt()];
        int bint =0;
        while(scan.hasNextInt()) {
        	arr[bint] = scan.nextInt();
        	bint ++;
        }
        Arrays.sort(arr);
        int currentTime = 0;
        int counter =0;
       // System.out.println(Arrays.toString(arr));
        for(int i =0 ;i < arr.length; i ++) {
        	if(currentTime<=arr[i]) {
        		counter ++;
        	
        //	System.out.println(currentTime);
        	currentTime += arr[i];
        	}

        }
        System.out.println(counter);
        
    }
}