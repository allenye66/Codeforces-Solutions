import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A1175{
    public static void main(String[] args) throws FileNotFoundException{
 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        for(int i =0 ; i < n ; i ++) {
        	long starting = scan.nextLong();
        	long divisor = scan.nextLong();
        	long counter = 0;
        	while(starting != 0) {
        		if(starting % divisor == 0) {
        			counter ++;
        			starting = starting / divisor;
        			
        		}else {
        			long temp = starting % divisor;
        			counter += temp;
        			starting -= temp;
        		}
        	}
        	System.out.println(counter);
        }
    }
}