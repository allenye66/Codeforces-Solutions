import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A136 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		int[] arr = new int[scan.nextInt()];
		for(int i =0 ; i < arr.length; i ++) {
			arr[scan.nextInt() - 1] =  i + 1;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
