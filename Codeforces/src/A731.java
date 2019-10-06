import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class A731 {
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        String s = "a" + scan.nextLine();
        int sum =0;
        for(int i = 0 ; i < s.length()-1; i ++) {
        	int buh =  Math.abs(s.charAt(i)-s.charAt(i+1));
        	sum += Math.min(buh, Math.abs(buh-26) );
        }
        System.out.println(sum);
        
    }
}