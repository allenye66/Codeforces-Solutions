import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class A897{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
	    int n = scan.nextInt();
	    int operations = scan.nextInt();
	    scan.nextLine();
    	char[] bar =  scan.nextLine().toCharArray();
	    for(int i = 0 ;i < operations; i ++) {
	    	String check = "";
	    	String[] arr = scan.nextLine().split(" ");
	    	int r1 = Integer.parseInt(arr[0])-1;
	    	int r2 = Integer.parseInt(arr[1])-1;
	    	char c1 = arr[2].charAt(0);
	    	char c2 = arr[3].charAt(0);
	    //	System.out.println("from " + r1 + " to " +  r2 + " change " + replace + " to " + str);
	    
	    	
	    		for(int j = r1 ; j <= r2 ; j ++) {
	    			if(bar[j] == (c1)) {
	    				bar[j] = c2;
	    			}
	    		}
	    	
		    for(int j =0 ; j < bar.length; j ++) {
		    	check += bar[j];
		    }
		  //  System.out.println("after change: " +   check);

	    }
	    String result = "";
	    for(int i =0 ; i < bar.length; i ++) {
	    	result +=  bar[i];
	    }
	    System.out.println(result);
    }
 
}
 