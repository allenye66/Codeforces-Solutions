import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A116 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int lines = scan.nextInt();
        int currentPeople = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < lines; i ++) {
        	int leaving = scan.nextInt();
        	int arriving = scan.nextInt();
        	currentPeople -= leaving;
        	currentPeople += arriving;
        	if(max < currentPeople) {
        		max = currentPeople;
        	}

        }
        System.out.println(max);
	}
	  
}
