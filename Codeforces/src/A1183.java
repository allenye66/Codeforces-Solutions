import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1183 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int nearest = scan.nextInt();
        ArrayList<Integer> ooga = new ArrayList<Integer>();
        for(int i =nearest ; i <= 2000 ; i ++) {
        	if(sumOfDigits(i)%4 == 0) {
        	//	System.out.println(i);
        		ooga.add(i);
        	}
        }
        if(ooga.size() == 0) {
        	System.out.println("NONE");
        	System.exit(0);
        }
        System.out.println(ooga.get(0));
               

	}
	 static int sumOfDigits(int n) 
	    {     
	        int sum = 0;      
	        while (n != 0) 
	        { 
	            sum = sum + n % 10; 
	            n = n/10; 
	        } 
	      
	    return sum; 
	    } 
	  
}
