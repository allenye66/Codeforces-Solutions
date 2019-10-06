import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A151{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int p = scan.nextInt();
        int nl = scan.nextInt();;
        int np = scan.nextInt();
        int drink = k *l;
        int toasts = drink/nl;
        int limes = c * d;
        int salt = p/np;
        System.out.println(Math.min(Math.min(toasts, salt), limes)/n);
        

        
    }

}