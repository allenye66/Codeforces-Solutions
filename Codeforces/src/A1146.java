import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A1146 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        String s = scan.nextLine();
        int a = 0;
        for(int i = 0;  i < s.length(); i ++) {
        	if(s.charAt(i) == 'a') {
        		a++;
        	}
        }

        if(a > (s.length() - a)) {

        	System.out.println(s.length());
        	System.exit(0);
        }
        int b1 = s.length() - 1;

        int b = s.length() - 1;
        int counter = 0;
        
        while(a < b) {
        	b--;
        	counter ++;
        }
        System.out.println(b + a -1 );
        

        /*
        // find x segment lengths, determine shortest one to remove
        
        //xaxxxxaxxxaxx
        //1,6,10
        // 1, 4, 3, length - 1 - last index
        ArrayList<Integer> indexOfS = new ArrayList<Integer>();
        
        for(int i =0 ; i < s.length(); i ++) {
        	int counter = 0;
        	if(s.charAt(i) == 'a') {
        		
        		indexOfS.add(i);
        	}
        }
        
        System.out.println(indexOfS);
        indexOfS.add(0, -1);
        ArrayList<Integer> segmentLengths = new ArrayList<Integer>();    
        for(int i = 0 ; i < indexOfS.size()-1; i ++) {
        	int n = indexOfS.get(i+1) - indexOfS.get(i);
        	//System.out.print(indexOfS.get(i+1) + " ");
        	//System.out.println(indexOfS.get(i));

        	segmentLengths.add(n -1 );
        }
        System.out.println(segmentLengths);
      
        //assuming there is more non-a's then a's, find how many non-a's we have to
        //remove to make the string have more a's than non-a's
        Collections.sort(segmentLengths);
        int non_a = s.length() - a;
        int reduce = 0;
        
        int a1 = a;
        int b1 = non_a;
        //5 x 2 a
        // need 4 a  3 x
        while(a1 < b1) {
        	a1 ++;
        	b1 --;
        }
        //int neededRemove = non_a - reduce;
        System.out.println(a1);
        System.out.println(b1);
        */

        
        
        
        
    }
}