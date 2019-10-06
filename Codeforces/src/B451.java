import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class B451 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0 ;i < n; i++) {
        		arr.add(scan.nextInt());
        }
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        sorted.addAll(arr);
        Collections.sort(sorted);
        Collections.reverse(arr);
        if(sorted.equals(arr)) {
        	System.out.println("yes");
        	System.out.println(1 + " " + n);
        	System.exit(0);
        }
        Collections.reverse(arr);
      /*  for(int i =0 ; i < arr.size(); i ++) {
        	System.out.println("there are " +  less(arr, i, arr.get(i))  + " numbers after " + arr.get(i) + " that are smaller than it"); 
        	
        }
        */
        
        for(int i =0 ; i < arr.size(); i ++) {
        	if(less(arr, i, arr.get(i))>=2) {
        		System.out.println("no");
        		System.exit(0);
        	}
        }
        
		System.out.println("yes");
		//find the decreasing end and start
		int b = 0;
		int e = 0;
		for(int i = 0 ; i < arr.size()-1; i ++) {
			if(arr.get(i + 1)> arr.get(i)) {
				b = i;
				break;
			}
		}
		for(int i = 0 ; i < arr.size()-1; i ++) {
			if(arr.get(i +1)< arr.get(i)) {
				e = i;
				break;
			}
		}
		System.out.println(e+ 1 + " " + (b + 1));

        
        
        
        //only works of the array is already decreasing or beginning parts of the array are decreased
        //check how many arr(i) < arr(i + 1)
        //boolean arr
        
        
    }
    static int less(ArrayList<Integer> a, int index, int number) {
    	int bounter = 0;
    	for(int i = index+1; i < a.size(); i ++) {
    		if(a.get(i) <= number) {
    			bounter ++;
    		}
    	}
    	return bounter;
    }
}