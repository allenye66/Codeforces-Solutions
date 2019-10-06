import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A492 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
     
        int n= scan.nextInt();
        int k=0;
        while (k*(k+1)*(k+2)<=6*n){
        	k+=1;
        }
       System.out.print(k-1);
    }
}