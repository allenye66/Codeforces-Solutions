import java.util.*;
import java.io.*;
public class A1311{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("/Users/allen/Desktop/Codeforces/txt.txt"));
		int n = scan.nextInt();
		for(int i =0 ; i < n ; i ++){
			long a = scan.nextLong();
			long b = scan.nextLong();
			if(a == b){
				System.out.println(0);
			}else{
				if(a% 2 == b% 2 ){
					if(a >b){
						System.out.println(1);
					}else{
						System.out.println(2);

					}
				}else{
					if(a < b){
						System.out.println(1);
					}
					else{
						System.out.println(2);
					}


				}
			}
		}
	}
}