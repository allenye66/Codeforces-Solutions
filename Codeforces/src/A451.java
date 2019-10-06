import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class A451 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int m = scan.nextInt();
        //int a = n * m;
        scan.close();
        System.out.println((Math.min(n, m) % 2 == 0)? "Malvika" : "Akshat");
        
    }
}