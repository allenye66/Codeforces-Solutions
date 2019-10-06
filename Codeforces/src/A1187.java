import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1187 {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("txt"));
        int lines = scan.nextInt();
        for(int i =0 ; i < lines ; i ++) {
        	int eggs = scan.nextInt();
        	int toys = scan.nextInt();
        	int stickers = scan.nextInt();
        	if(toys == eggs && eggs == stickers) {
        		System.out.println(1);
        	}else  {
        		System.out.println(Math.max(eggs - toys, eggs - stickers) + 1);
        	}
        }
        
	}
	  
}
