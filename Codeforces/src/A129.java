import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class A129{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int digits = scan.nextInt();
        int sum =0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(scan.hasNextInt()) {
        	int n = scan.nextInt();
        	arr.add(n);
        	sum += n;
        }
        int ooga = 0;
        for(int i =0 ; i < digits; i ++) {
        	if( ((sum-arr.get(i))%2==0)) {
        		ooga ++;
        	}
        }
        System.out.println(ooga);
      
 
 
    }
}