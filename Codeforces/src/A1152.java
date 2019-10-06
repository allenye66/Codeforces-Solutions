import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class A1152 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int chests = scan.nextInt();
        int keys = scan.nextInt();
        int ccounter = 0;
        int kcounter = 0;
        ArrayList<Integer> c = new ArrayList<Integer>();
        for(int i =0 ; i < chests; i ++) {
        	int n =  scan.nextInt();
        	if(n%2 == 1) {
        		ccounter ++;
        	}
        	c.add(n);
        }
        ArrayList<Integer> k = new ArrayList<Integer>();
        for(int i =0 ; i < keys; i ++) {
        	int n = scan.nextInt();
        	if(n % 2 == 1) {

        		kcounter ++;
        	}
        	k.add(n);
        }
        System.out.println(Math.min(kcounter, chests - ccounter)+  Math.min(ccounter, keys - kcounter));
        
      
        /*
        int counter = 0;
        for(int i =0 ; i < chests; i ++) {
        	for(int j =0 ; j < keys; j ++) {
        		
        		if(c.get(i) % 2 == 1 && c.get(i) > 0) {
        			if(k.get(j) % 2 == 0 && k.get(j) > 0) {
        				c.set(i, -1);
        				k.set(j, -1);
        				counter ++;
        			}
        		}
        		
        	}
        }
        for(int i =0 ; i < keys; i ++) {
        	for(int j =0 ; j < chests; j ++) {
        		
        		if(k.get(i) % 2 == 1 && k.get(i) > 0) {
        			if(c.get(j) % 2 == 0 && c.get(i) > 0) {
        				c.set(i, -1);
        				k.set(j, -1);
        				counter ++;
        			}
        		}
        	}
        }
    */

    }
}