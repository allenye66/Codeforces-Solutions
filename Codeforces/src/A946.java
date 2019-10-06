import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A946 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        boolean allPos = true;
        while(scan.hasNextInt()) {
        	int t = scan.nextInt();
        	if(t < 0) {
        		allPos = false;
        	}
        	arr.add(t);
        }
        if(allPos) {
        	int c = 0;
        	for(int i =0 ; i < arr.size();i ++) {
        		c += arr.get(i);
        	}
        	System.out.println(c);
        }else {
        	int pos = 0;
        	int neg = 0;
        	for(int i =0 ; i < arr.size();i ++) {
        		if(arr.get(i)>0) {
        			pos += arr.get(i);
        		}else {
        			neg -= arr.get(i);
        		}
        	}

        	System.out.println(pos + neg);
        	
        }
        
    }
}