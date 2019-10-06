import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class A584 {
	public static void main(String[] args) throws FileNotFoundException{	

		Scanner scan = new Scanner(new File("txt"));
		int length = scan.nextInt();
		String divisible = scan.next();
		while(divisible.length() < length) {
			divisible += "0";
		}
	
		if(divisible.length() == length) {
			System.out.println(divisible);
		}else {
			System.out.println(-1);
		}
		
	}
}