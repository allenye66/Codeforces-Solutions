import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A426 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int length = scan.nextInt();
        int volume = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(scan.hasNextInt()) {
        	arr.add(scan.nextInt());
        }
        int friends =  length - 1;
        int counter =0;
        Collections.sort(arr);
        for(int i =0 ; i < friends; i ++) {
        	counter += arr.get(i);
        }
        if(counter > volume) {
        	System.out.println("NO");
        }else {
        	System.out.println("YES");
        
        }
        
    }
}