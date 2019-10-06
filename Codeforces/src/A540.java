import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class A540 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        String one = scan.next();
        String two  = scan.next();
        int c = 0;
        for(int i =0 ; i < n ; i ++) {
        //	int b = Math.min((one.charAt(i) + (9-two.charAt(i))), (two.charAt(i) + (9-one.charAt(i))))+1;
        //	System.out.println(b);
        	c+= Math.min(Math.abs(Integer.parseInt(one.charAt(i)+"")- Integer.parseInt(two.charAt(i)+"")),Math.min((one.charAt(i) + (9-two.charAt(i))), (two.charAt(i) + (9-one.charAt(i))))+1);
        }
        System.out.println(c);
    }
}