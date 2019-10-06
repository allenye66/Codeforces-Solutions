import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A355{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(b== 0 && a > 1) {
        	System.out.println("No solution");
        }else {
        	String result = "";
        	result += b + "";
        	for(int i = 1 ; i < a; i ++) {
        		result += 0;
        		
        	}
        	System.out.println(result);
        }
    	
    }

}