import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class A510 
{
    public static void main(String[] args) throws FileNotFoundException{
    	Scanner scan  = new Scanner(new File("txt"));
    	int n = scan.nextInt();
    	int m = scan.nextInt();
    	String body = "";
    	for(int i =0 ; i < m; i++) {
    		body += "#";
    	}
    	String left = "#";
    	for(int i =1 ; i < m; i ++ ) {
    		left +=  ".";
    	}
    	String right = "";
    	for(int i =0 ; i < m-1; i ++ ) {
    		right +=  ".";
    		
    	}
    	right += "#";
    	for(int i =0 ; i < n ; i ++) {
    		if(i % 2 == 0) {
    			System.out.println(body);
    		}else if( (i - 1)% 4 == 0 ) {
    			System.out.println(right);
    		}else {
    			System.out.println(left);
    		}
    	}

    	
    }
        
        
    
}