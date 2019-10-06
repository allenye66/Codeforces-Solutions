import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A266{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println(s);
        int counter = 0;
        for(int i =0  ; i < s.length()-1; i ++) {
        	//System.out.println("comparing" + s.charAt(i) + " with " + s.charAt(i + 1));
        	if(s.charAt(i) == s.charAt(i + 1)) {
        		counter ++;
        	}
        }
        System.out.println(counter);
        
        
    }

}