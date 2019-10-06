import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class C977 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n  = scan.nextInt();
        int numbers = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        while(scan.hasNextInt()) {
        	arr.add(scan.nextInt());
        }
        Collections.sort(arr);
        if(numbers == n || arr.get(numbers) < arr.get(numbers+1))
			System.out.println(arr.get(numbers));
        else {
        	System.out.println(-1);
        }

        
    }
}