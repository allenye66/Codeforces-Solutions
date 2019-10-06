import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
public class B1181{
	static String s;
	static String a = " ";
	static String b = " ";
    public static void main(String[] args) throws FileNotFoundException{
 
        Scanner scan = new Scanner(new File("txt"));
        int length = scan.nextInt();
        scan.nextLine();
        s = scan.nextLine();
        a = s.substring(0, s.length() /2);
        b = s.substring(s.length()/2, s.length());
       
        int middle = s.length()/2;
        if(s.charAt(middle) == '0') {
        	String a1 = " ", b1 = " ";
        	a1 = s.substring(0, s.length() /2+1);
        	b1 = s.substring(s.length()/2+1, s.length());
        	//String temp  = "" + Math.max((Long.parseLong(a1) + Long.parseLong(b1)), (Long.parseLong(a) + Long.parseLong(b)));
   
        	BigInteger bigInt1= new BigInteger(a1 + b1);
        	BigInteger bigInt2= new BigInteger(a + b);
        	if(bigInt1.compareTo(bigInt2) == 1) {
            	System.out.println(bigInt1);
        	}else {
        		System.out.println(bigInt2);
        	}
        	//System.out.println(a + "  " + b);
        	//System.out.println(a1 + "  " + b1);
        	System.exit(0);
        }
        
        if(length % 2 == 0) {
        	 equal();
        }else {
        	largeLeft();

        	
        }
      
        
    }
    public static void equal() {
    	
    	// System.out.println(a + " " + b);
    	BigInteger bigInt2= new BigInteger(a + b);
    	
    		System.out.println(bigInt2);
  
    }
    public static void largeLeft() {
    	String a1 = " ", b1 = " ";
    	a1 = s.substring(0, s.length() /2+1);
    	b1 = s.substring(s.length()/2+1, s.length());
    	
    	System.out.println(a1);
    	System.out.println(b1);

    	BigInteger bigInt1= new BigInteger((a1 + b1));
    	BigInteger bigInt2= new BigInteger(a + b);
    	if(bigInt1.compareTo(bigInt2) == -1) {
        	System.out.println(bigInt1);
    	}else {
    		System.out.println(bigInt2);
    	}

    }
}