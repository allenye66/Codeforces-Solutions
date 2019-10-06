import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class A723 {
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
		int[] arr = {scan.nextInt(),scan.nextInt(),scan.nextInt()};
		Arrays.sort(arr);
		System.out.println(arr[1]-arr[0] + arr[2]-arr[1]);
	}
}