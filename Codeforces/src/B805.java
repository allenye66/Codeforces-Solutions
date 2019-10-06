import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class B805 
{
	public static void main(String[] args) throws FileNotFoundException{

		Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		StringBuilder str = new StringBuilder();
		

			while(str.length() <= n) {
				str.append("aabb");
			}
			System.out.println(str.toString().substring(0,n));



		
	}
}