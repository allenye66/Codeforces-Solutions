import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class A1095 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
    	
    	Scanner scan = new Scanner(new File("txt"));
    	int length = Integer.parseInt(scan.nextLine());
    	String s = scan.nextLine();
    	int n = 0;
    	String result = "";
    	for(int i =0 ; i < length; i ++) {
    		result += s.charAt(i);
    		i += n += 1;
    		
    	}
    	System.out.println(result);
    	
    	
    }
}