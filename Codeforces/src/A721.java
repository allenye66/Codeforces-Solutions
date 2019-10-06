import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class A721 {
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();
        s = s + "i";
        int counter = 0;
        int buh = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0 ; i < n + 1; i ++) {
        	if(s.charAt(i) == 'B') {
        		counter ++;
        		
        	}else {
        		if(counter != 0)
        		arr.add(counter);
        		counter = 0;
        		buh ++;
        	}
        }
     
        System.out.println(arr.size());
        for(int i =0 ; i < arr.size(); i ++) {
        	System.out.print(arr.get(i) + " ");
        }
    }
}