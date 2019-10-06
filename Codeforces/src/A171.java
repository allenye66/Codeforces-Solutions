import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
public class A171{

    public static void main(String[] args) throws FileNotFoundException{
 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        String m = scan.next();
        StringBuilder temp = new StringBuilder();
        temp.append(m);
        temp.reverse();
        int a = Integer.parseInt(temp.toString());
        System.out.println(n + a);
        
    }
}