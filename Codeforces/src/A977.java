import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A977{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int k = scan.nextInt();
        for(int i = 0; i < k ; i ++){
            if(n % 10 != 0){
                n--;
            }else{
                n = n /10;
            }
        }
        System.out.println(n);
    }
}