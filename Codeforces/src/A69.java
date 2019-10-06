import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A69 {
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;

        for(int i =0 ; i < n;i ++) {
        	int a1 = scan.nextInt();
        	int b1 = scan.nextInt();
        	int c1 = scan.nextInt();
        	 a += a1;
        	 b += b1;
        	 c += c1;

        }
        if(a == 0 && b== 0 && c == 0) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
        
	}
}