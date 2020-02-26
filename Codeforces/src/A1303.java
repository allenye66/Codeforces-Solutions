import java.util.*;
import java.io.*;
public class A1303{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<String> strs = new ArrayList<String>();
        for(int i =0; i < n; i ++){
            strs.add(scan.nextLine());
        }
        //System.out.println(strs);
        for(int i =0 ; i < n; i ++) {
        	String s = strs.get(i);
        	if(allZero(s)){
        		System.out.println(0);
        	}else {
        		ArrayList<Integer> ones = new ArrayList<Integer>();
        		for(int j =0 ; j < s.length(); j ++) {
        			if(s.charAt(j) != '0') {
        				ones.add(j);
        			}
        		}
        	//	System.out.println(ones);
        		if(allConsec(ones)) {
        			System.out.println(0);
        		}else {
        			int sum = 0;
        			for(int j = 0; j < ones.size() - 1; j ++) {
        				if(ones.get(j+1) - ones.get(j) != 1) {
        					sum += (ones.get(j+1)-1)- ones.get(j);
        				}
        			}
        			System.out.println(sum);
        		}
        		
        		

        		
        	}
        }
    }
    static boolean allZero(String s) {
    	
    	 boolean hasOne = false;
         for(int j =0 ; j < s.length(); j ++) {
         	if((s.charAt(j) + "").equals("1")) {
         		hasOne = true;
         		break;
         	}
         }
         if(!hasOne) {
         	return true;
         }else {
        	 return false;
         }
    }
    static boolean allConsec(ArrayList<Integer> arr) {
    	if(arr.size() == 1) {
    		return true;
    	}
    	for(int i =0 ; i < arr.size()-1; i ++) {
    		if(arr.get(i + 1) - arr.get(i) != 1) {
    			return false;
    		}
    	}
    	return true;
    }
}