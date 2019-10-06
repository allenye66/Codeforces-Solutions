import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A1017 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int first = scan.nextInt() + scan.nextInt() +scan.nextInt() +scan.nextInt() ;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(first);

        for(int i = 0 ; i < n-1; i ++) {
        	int sum = scan.nextInt() + scan.nextInt() +scan.nextInt() +scan.nextInt();
        	arr.add(sum);
        }
        Collections.sort(arr);
     //   System.out.println(arr);
       // System.out.println(first);

        for(int i =arr.size() -1 ; i  >= 0; i --) {
        //	System.out.println("ooga" + arr.get(i));
        	if(arr.get(i) == first) {
        		System.out.println(arr.size() - i);
        		System.exit(0);
        	}
        }
    }
}