import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class A35 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int starting = scan.nextInt();
        
      
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();
        int fourth = scan.nextInt();
        int fifth = scan.nextInt();
        int sixth = scan.nextInt();
        if(first == starting) {
        	starting = second;
        }else if(starting == second){
        	starting = first;
        }
        if(third == starting) {
        	starting = fourth;
        }else if(starting == fourth){
        	starting = third;
        }
        if(fifth == starting) {
        	starting = sixth;
        }else if(starting == sixth){
        	starting = fifth;
        }
        System.out.println(starting);
    }
}