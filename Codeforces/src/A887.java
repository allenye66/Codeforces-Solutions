import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class A887 
{
	static ArrayList<Integer> arr;
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        String s = scan.nextLine();
        int firstone = -1;
        for(int i =0  ; i < s.length(); i ++) {
        	if(s.charAt(i)== '1') {
        		firstone = i;
        		break;
        	}
        }
        if(firstone == -1) {
        	System.out.println("no");
        	System.exit(0);
        }
 //       System.out.println(firstone);
        int zeroes = 0;
        for(int i =firstone  ; i < s.length(); i ++) {
        	if(s.charAt(i)=='0') {
        		zeroes ++;
        	}
        }
   //     System.out.println(zeroes);
        if(zeroes >= 6) {
        	System.out.println("yes");
        }else {
        	System.out.println("no");
        }
    }
        
        
    
}