import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1110 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int multiplier = scan.nextInt();
        int digits = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(scan.hasNextInt()) {
        	arr.add(scan.nextInt());
        }
        long sum = 0;
        int temp= digits-1;
        
        
       
        int debug = 0;
        for(int i =0 ; i < digits-1; i ++) {
        	//System.out.println(temp);
        	System.out.println(arr.get(i) + " * " + multiplier + " to the power of " + temp);
        	double num = Math.pow(multiplier, temp) * arr.get(i);
        	debug += num;
        	sum += num % 2;
        	temp --;
        }
        System.out.println(arr.get(arr.size() -1 ));
        sum += arr.get((arr.size() -1 )%2);
        debug += arr.get(arr.size() - 1);
        System.out.println(debug);
        if(sum %  2 == 0) {
        	System.out.println("even");
        }else {
        	System.out.println("odd");
        }
	} 
	  
}
