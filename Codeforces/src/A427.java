import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class A427 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        
        int c = 0;
       	int unsolved = 0;

        for(int i =0 ; i < n; i ++) {
        	c+= scan.nextInt();
        	if( c< 0) {
        		c = 0;
        		unsolved ++;
        	}
        	
        }
		System.out.println(unsolved);
    }
}