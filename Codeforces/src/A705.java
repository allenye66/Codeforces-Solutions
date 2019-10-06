import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A705{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
	    String s = "";
	    int n = Integer.parseInt(scan.nextLine());
	    for(int i = 0; i < n; i ++ ) {
	    	if(i % 2 == 0) {
	    		s += "I hate";
	    	}else {
	    		s += "I love";
	    	}
	    	s += " that ";
	    }
	    //System.out.println(s);
	    System.out.println(s.substring(0, s.length() - 5) + "it");

    }
 
}
 