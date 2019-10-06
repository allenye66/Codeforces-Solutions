import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A339{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        String str = scan.nextLine();
        String s = str.replace("+", "");
        ArrayList<Integer> ooga = new ArrayList<Integer>();
        for(int i =0  ; i < s.length(); i ++) {
        	String temp = "" + s.charAt(i);
        	if(temp != "+")
        		ooga.add(Integer.parseInt(temp));
        }
       // System.out.println(ooga);
        Collections.sort(ooga);
        String result ="";
        for(int i =0 ; i < ooga.size() ; i ++) {
        	if(i != ooga.size() - 1)
        	result += ooga.get(i) + "+";
        	else {
        		result += ooga.get(i);
        	}
        }
        System.out.println(result);
        
        
    }

}