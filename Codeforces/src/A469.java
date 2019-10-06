import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class A469 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int bint = scan.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        while(bint != 0) {
        	set.add(scan.nextInt());
        	bint --;
        }
        scan.nextInt();
        while(scan.hasNextInt()) {
        	set.add(scan.nextInt());
        }
        
        System.out.println(set.size() == n? "I become the guy." : "Oh, my keyboard!");
        
        

    }
}