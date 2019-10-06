import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B1194 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int queries = Integer.parseInt(scan.nextLine());
        for(int i =0 ; i< queries; i ++) {
        	int row = scan.nextInt();
        	int column = scan.nextInt();
        	char[][] arr = new char[row][column];
        	scan.nextLine();
        	boolean hasHole = false;
    		String check = "";

        	for(int j = 0; j < row; j ++) {
        		String s = scan.nextLine();
        		check += s;
        		
        		//System.out.println(s);
        		for(int k = 0; k < column; k ++) {
            		arr[j][k] = s.charAt(k);
            	}
            	

        	}        		
        	//System.out.println(check);

        	if(check.equals(".*.*.*.*.")) {
        		hasHole = true;
        	}
        //	System.out.println(Arrays.deepToString(arr));
        	ArrayList<Integer> horizontal = new ArrayList<Integer>();
        	ArrayList<Integer> vertical = new ArrayList<Integer>();
        	for(int j = 0; j < row; j ++) {
            	int counter = 0;

        		for(int k = 0; k < column; k ++) {
        			if(arr[j][k] =='*') {
        				counter ++;
        			}
        		}
        		horizontal.add(counter);
        	}
        	
        	for(int j = 0; j < column; j ++) {
            	int counter = 0;

        		for(int k = 0; k < row; k ++) {
        			if(arr[k][j] =='*') {
        				counter ++;
        			}
        		}
        		vertical.add(counter);
        	}
        	
        	int vmax = 0;
        	int vindex = 0;
        	for(int j = 0 ; j < vertical.size(); j ++) {
        		if(vertical.get(j) > vmax) {
        			vmax = vertical.get(j);
        			vindex = j;
        		}
        	}
        	int hmax = 0;
        	int hindex = 0;
        	for(int j = 0 ; j < horizontal.size(); j ++) {
        		if(horizontal.get(j) > hmax) {
        			hmax = vertical.get(j);
        			hindex = j;
        		}
        	}
        	
        	
        	
        	//only sort if they arent in the same
        	Collections.sort(vertical);
        	Collections.sort(horizontal);
        	int largestvertical = vertical.get(vertical.size()-1);
        	int largesthorizontal = horizontal.get(horizontal.size()-1);
        	
        	int sum = (column - largesthorizontal) + (row - largestvertical);

        	if(!hasHole ) {
        		System.out.println(sum);
        	}else  {
            	System.out.println(sum - 1);

        	}
        	//System.out.println(row + " " + column);
        	//System.out.println("ooga" + horizontal);
        	//System.out.println("booga" + vertical);
        	

        	
        }
        
	}
	  
}
