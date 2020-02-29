import java.util.*;
import java.io.*;
public class A1281{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("/Users/allen/Desktop/Codeforces/txt.txt"));
		int n = scan.nextInt();
		for(int i = 0 ; i < n; i ++){
			String s = scan.next();
			if(s.length() > 5){
			s = s.substring(s.length() - 5, s.length());
			}	
			if(s.contains("po")){
				System.out.println("FILIPINO");
			}else if(s.contains("desu") || s.contains("masu")){
				System.out.println("JAPANESE");
			}else{
				System.out.println("KOREAN");
			}
		}

	}
}