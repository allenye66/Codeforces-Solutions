import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A519 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        char[][] bar = new char[8][8];
        int white = 0;
        int black = 0;
        for(int i =0 ; i <8; i ++) {
        	String ing = scan.nextLine();
       // 	System.out.println(ing);

        	for(int j = 0 ;  j < 8; j ++) {
        		if((ing.charAt(j)+"").equals("Q")) {
        			white += 9;
        		}else if((ing.charAt(j)+"").equals("R")) {
        			white += 5;
        		}else if((ing.charAt(j)+"").equals("B")) {
        			white += 3;
        		}else if((ing.charAt(j)+"").equals("N")) {
        			white += 3;
        		}else if((ing.charAt(j)+"").equals("P")) {
        			white += 1;
        		}else if((ing.charAt(j)+"").equals("q")) {
        			black += 9;
        		}else if((ing.charAt(j)+"").equals("r")) {
        			black += 5;
        		}else if((ing.charAt(j)+"").equals("b")) {
        			black += 3;
        		}else if((ing.charAt(j)+"").equals("n")) {
        			black += 3;
        		}else if((ing.charAt(j)+"").equals("p")) {
        			black += 1;
        		}
        	}
        }
      //  System.out.println(black + " " + white);
        if(black == white) {
        	System.out.println("Draw");
        }else if(black > white) {
        	System.out.println("Black");
        }else {
        	System.out.println("White");
        }
    }
}