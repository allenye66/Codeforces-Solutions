import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A1077 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        for(int i =0 ; i < n ; i ++) {
        	long sum = 0;
        	long plus = scan.nextInt();
        	long minus = scan.nextInt();
        	long times = scan.nextInt();
        //	System.out.println("oogaing" + plus + " " + minus + " " + times);
        	if(times % 2 == 1) {
        		sum += plus * (times + 1)/2;
        	//	System.out.println("added " + sum + " subtracting " + minus * times/2);
        		
        		sum -= minus * (int)(times/2);
        	}else {
        		sum += plus * (times)/2;
        		sum -= minus *  (int)(times/2);
        	}
        	System.out.println(sum);

        	
        }
        
        
    }
}