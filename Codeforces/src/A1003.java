import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A1003{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	   Scanner scan = new Scanner(new File("txt"));
	   int n = scan.nextInt();
	   ArrayList<Integer> arr = new ArrayList<Integer>();
	   while(scan.hasNextInt()) {
		   arr.add(scan.nextInt());
	   }
	   Collections.sort(arr);
	   int max = 1;
	   int temp = 1;
	//   System.out.println(arr);
	   for(int i =0 ; i < n - 1; i ++) {
		   if(arr.get(i) == arr.get(i + 1)) {
			   temp++;
		   }else {
			   temp = 1;
		   }
		   if(max < temp) {
			   max = temp;
		   }
	   }
	   System.out.println(max);
    }
}