import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A443{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        String s = scan.nextLine();
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
       // System.out.println(str);
        ArrayList<String> ooga = new ArrayList<String>();
        
        for(int i =0 ; i < str.length(); i ++) {
        	String temp = "" + str.charAt(i);
        	//System.out.println(temp);
        	if(ooga.contains(temp)) {
        		
        	}else {
        		ooga.add(temp);
        	}
        }
       // System.out.println(ooga);
       System.out.println(ooga.size());
        
    }

}