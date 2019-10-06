import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A148 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int dragons = scan.nextInt();
        int counter = 0;
        for(int i = 1; i < dragons + 1; i ++) {
        	if(i % a == 0) {
        		
        	}else if(i % b == 0) {
        		
        	}else if(i % c == 0) {
        		
        	}else if(i % d == 0) {
        		
        	}else {
        		counter ++;
        	}
        }
        System.out.println(dragons - counter);
    }
}