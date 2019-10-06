import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class B55 
{
    public static void main(String[] args) throws FileNotFoundException{
    	Scanner scan  = new Scanner(new File("txt"));
    	long[] arr = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
    	Arrays.sort(arr);
    	scan.nextLine();
    	String s = scan.nextLine();
    	s= s.replaceAll(" ", "");
    	//System.out.println(Arrays.toString(arr));
    	//System.out.println(s);
    	int multiply = 0;
    	for(int i =0 ; i < s.length(); i ++) {
    		if(s.charAt(i) =='*') {
    			multiply ++;
    		}
    	}
    	long result = 0;
    	if(multiply == 0) {
    		for(int i = 0 ; i < arr.length; i ++) {
    			result += arr[i];
    		}
    	}else if(multiply == 1) {
    		if(arr[0] == 0 || arr[1] == 0|| arr[2] == 0|| arr[3] == 0) {
    			System.out.println(0);
    			System.exit(0);
    		}
    		result += arr[0] *arr[1] + arr[2] + arr[3];
    	}else if(multiply == 2) {
    		if(arr[0] == 0 || arr[1] == 0|| arr[2] == 0|| arr[3] == 0) {
    			System.out.println(0);
    			System.exit(0);
    		}
    		long x = arr[0] * arr[1];
    		long y = arr[2];
    		long z = arr[3];
    		result = Math.min((x *y + z),(x * z + y));
    		result = Math.min(( arr[0] * arr[1] + arr[3] * arr[2]), result);
    	}else {
    		if(arr[0] == 0 || arr[1] == 0|| arr[2] == 0|| arr[3] == 0) {
    			System.out.println(0);
    			System.exit(0);
    		}
    		//System.out.println(Arrays.toString(arr));
 
    		result += arr[0] * arr[1] * arr[2]* arr[3];
    	}
    	System.out.println(result);
    	
    }
        
        
    
}