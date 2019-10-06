import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A160 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int[] arr = new int[n];
        int ruh = 0;
        for(int i = 0 ; i < n ; i ++) {
        	int ben = scan.nextInt();
        	ruh += ben;
        	arr[i] = ben;
        }
        Arrays.sort(arr);
        int bounter =0;
        int buh =0;
        for(int i =0 ; i <n; i ++) {
        	bounter ++;
        	ruh -= arr[n-1-i];
        	buh +=arr[n-1-i];
        	if(ruh < buh ) {
        		break;
        	}
        }
        System.out.println(bounter);
      
	}
	  
}
