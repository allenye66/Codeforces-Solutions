import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class A734{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
	    int b = scan.nextInt();
	    scan.nextLine();
	    String s = scan.nextLine();
	    
	    char[] arr = s.toCharArray();
	    int a = 0;
	   // System.out.println(Arrays.toString(arr));
	    for(int i =0 ; i < s.length(); i ++) {
	    	if(arr[i] == 'A') {
	    		a++;
	    	}
	    }
	    int d = b - a;
	    System.out.println(a +  " " + d);
	   
	    if(a > d) {
	    	System.out.println("Anton");
	    }else if(d > a) {
	    	System.out.println("Danik");
	    }else {
	    	System.out.println("Friendship");
	    }
	    
    }
 
}
 