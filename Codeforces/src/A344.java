import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
 
public class A344{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        ArrayList<String> ooga = new ArrayList<String>();
        while(scan.hasNextLine()) {
        	ooga.add(scan.nextLine());
        }
        int counter = 0;
     
        for(int i =0 ; i < ooga.size()-1; i ++)
        {
        	if(!ooga.get(i).equals(ooga.get(i + 1))) {
        		counter ++;
        	}
        	
        }
        System.out.println(counter);
    }   
}