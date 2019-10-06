import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class A1144 
{
    public static void main(String[] args) throws FileNotFoundException{
    	Scanner scan  = new Scanner(new File("txt"));
    	int n = scan.nextInt();
    	scan.nextLine();
    	for(int i =0 ; i < n ; i ++) {
    		String s = scan.nextLine();
    		
        	ArrayList<Integer> arr = new ArrayList<Integer>();
        	for(int j = 0 ; j < s.length();j ++) {
        		arr.add((int)s.charAt(j));
        	}
        	Collections.sort(arr);
        	Set<Integer> set = new HashSet<Integer>(arr);

        	boolean has = false;
        	if(set.size() < arr.size()){
        	    has = true;
        	}
        	if(Collections.max(arr)-Collections.min(arr)  == s.length()-1 && has == false){
        		System.out.println("Yes");
        	}else {
        		System.out.println("No");
        	}
        	//System.out.println(arr);
    	}
    	
    }
        
        
    
}