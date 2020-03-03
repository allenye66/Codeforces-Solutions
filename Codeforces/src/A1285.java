import java.util.*;
import java.io.*;
public class A1285{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("/Users/allen/Desktop/Codeforces/txt.txt"));
		int n = scan.nextInt();
		String s = scan.next();
		int left = 0;
		int right = 0;
		for(int i =0 ; i < n; i ++){
			if(s.charAt(i) == 'L'){
				left--;
			}else{
				right++;
			}
		}
		if(left <= 0){
		System.out.println(right + 1 + Math.abs(left));
		}
		else{
		System.out.println(right + Math.abs(left));
		}
	}

}