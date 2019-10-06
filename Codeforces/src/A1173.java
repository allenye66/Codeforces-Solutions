import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1173 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int positive = scan.nextInt();
        int negative = scan.nextInt();
        int neutral = scan.nextInt();
        
        if((positive == negative) && neutral == 0) {
        	System.out.println(0);
        }
        if((positive == negative) && neutral != 0) {
        	System.out.println("?");
        }
        if(positive > negative) {
        	if(neutral >= Math.abs(positive - negative)) {
        		System.out.println("?");
        	}
        	else {
        		System.out.println("+");
        	}
        }
        if(negative > positive) {
        	if(neutral >= Math.abs(positive - negative)) {
        		System.out.println("?");
        	}else {
        		System.out.println("-");
        	}
        }
	}
	  
}
