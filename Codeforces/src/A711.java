import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class A711{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
	    int n = Integer.parseInt(scan.nextLine());
	    ArrayList<String> arr = new ArrayList<String>();
	    boolean oolean = false;
	    while(scan.hasNextLine()) {
	    	arr.add(scan.nextLine());
	    }
	    for(int i =0 ; i < n; i ++) {
	    	String current = arr.get(i);
	    	char[] bar = current.toCharArray();
	    	for(int j = 0; j < bar.length-1; j ++) {
	    		if(bar[j] == 'O' && bar[j + 1] == 'O') {
	    			oolean = true;
	    			bar[j] = '+';
	    			bar[j + 1] = '+';
	    			break;
	    			
	    		}
	    	}
	    	String result = "";
	    	for(int j =0 ; j < bar.length; j ++) {
	    		result += bar[j];
	    	}
	    	if(oolean) {
	    		arr.set(i, result);
	    		break;
	    	}
	    }
	    if(oolean) {
	    	System.out.println("YES");
	    	for(int i =0 ;i < n; i ++) {
		    	System.out.println(arr.get(i));

	    	}
	    }else {
	    	System.out.println("NO");

	    }
	    

    }
 
}
 