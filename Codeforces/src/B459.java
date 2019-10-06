import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class B459 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        ArrayList<Long> arr = new ArrayList<Long>();
        while(scan.hasNextLong()) {
        	arr.add(scan.nextLong());
        }
        Collections.sort(arr);

        long ma = arr.get(arr.size() - 1);
        long mi = arr.get(0);
        long maxs = Collections.frequency(arr, ma);
        long mins = Collections.frequency(arr, mi);
      
        System.out.print(ma - mi+ " " );
        System.out.println(ma==mi?((long)n*(long)(n-1)/2):(maxs*mins));
    }
}