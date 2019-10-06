import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A855 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<String> arr = new ArrayList<String>();
        while(scan.hasNextLine()) {
        	arr.add(scan.nextLine());
        }
        ArrayList<String> usedWords = new ArrayList<String>();

        for(int i =0 ; i < n; i ++) {
        	String str = arr.get(i);
        	if(usedWords.contains(str)) {
        		System.out.println("YES");
        	}else {
        		System.out.println("NO");
        	}
            usedWords.add(str);
            
            


        }
      
        
    }
}