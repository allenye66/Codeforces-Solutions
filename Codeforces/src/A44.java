import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class A44 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        scan.nextLine();
      
        Set<String> set = new HashSet<String>();
        
        
        while(scan.hasNextLine()) {
        	set.add( scan.nextLine());
        }
        System.out.println(set.size());
    }
}
//import java.io.File;import java.io.FileNotFoundException;import java.util.HashSet;import java.util.Scanner;import java.util.Set;public class A44{public static void main(String[] args) throws FileNotFoundException{ Scanner scan = new Scanner(new File("txt"));scan.nextLine();Set<String> set = new HashSet<String>();while(scan.hasNextLine()) {set.add( scan.nextLine());}System.out.println(set.size());}}