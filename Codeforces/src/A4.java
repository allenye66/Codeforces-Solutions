import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A4 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        
        Scanner input = new Scanner(new File("txt"));
        int w;
        w = input.nextInt();
    
        if((w%2)==0 && w > 2){
            System.out.println("YES");
        
        }
        else
            System.out.println("NO");
    }
}