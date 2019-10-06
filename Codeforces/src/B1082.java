import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class B1082 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = Integer.parseInt(scan.nextLine());
        String str = scan.nextLine();
        char[] bar = str.toCharArray();
        int bint = 0, cint = 0, kint = 0;
        int max = 0;
        for(int i = 0 ; i < n ; i ++) {
        	if(bar[i]=='G'){
    			bint++;
    			cint++;
    		}
    		else{
    			kint=cint;
    			cint=0;
    		}
        	max = Math.max(max,cint + kint + 1);
        }
        System.out.println(Math.min(bint,max));


        
        
    }
}