import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class B489 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
	    int n = scan.nextInt();
	    ArrayList<Integer> b = new ArrayList<Integer>();
	    for(int i =0 ; i < n; i ++) {
	    	b.add(scan.nextInt());
	    }
	    int m = scan.nextInt();
	    ArrayList<Integer> g = new ArrayList<Integer>();
	    for(int i =0 ; i < m; i ++) {
	    	g.add(scan.nextInt());
	    }
	    int c = 0;

	    Collections.sort(b);
	    Collections.sort(g);

	    for(int i =0 ; i < n; i ++) {
	    	for(int j =0 ; j < m; j ++) {
		    	if(Math.abs(b.get(i)-g.get(j))<2) {
		    		c++;
		    		g.set(j, 200);
		    		break;
		    	}
		    }
	    }
	    System.out.println(c);
    }
}