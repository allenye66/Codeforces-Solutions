import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A112{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        String x = scan.nextLine();
        String y = scan.nextLine();
        String a = x.toLowerCase();
        String b = y.toLowerCase();
        if(a.compareTo(b) > 0){
            System.out.println("1");
        }else if (a.compareTo(b) == 0){
            System.out.println("0");
 
        }else{
            System.out.println("-1");
 
        }
      
 
 
    }
}