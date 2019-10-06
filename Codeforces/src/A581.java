import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A581{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int answer = 0;
        int answer2 = 0;
 
        if(a == b){
            answer = a;
            answer2 = 0;
        }
        if(a > b){
            answer = b;
            answer2 = (a-b)/2;
        }
        if(a < b){
            answer = a;
            answer2 = (b-a)/2;
        }    
        
        
       System.out.println(answer + " " + answer2);
    }
}