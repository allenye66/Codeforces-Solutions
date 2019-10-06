import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A32 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int maxDist = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(scan.hasNextInt()) {
        	arr.add(scan.nextInt());
        	
        }
        Collections.sort(arr);
        ArrayList<Integer> distances = new ArrayList<Integer>();

        for(int i =0 ;i < n; i ++) {
        	for(int j =i +1; j < n; j ++) {
        		distances.add(arr.get(j)-arr.get(i));
        	}
        }
        Collections.sort(distances);
       // System.out.println(distances);
        int counter =0 ;
        for(int i =0 ; i < distances.size();i++) {
        	if(distances.get(i) <= maxDist) {
        		counter ++;
        	}
        }
        
        //MIGHT NEED TO ONLY ADD ONE IF IT IS A DUPILCATE
        System.out.println(counter * 2);
        
	}
}
