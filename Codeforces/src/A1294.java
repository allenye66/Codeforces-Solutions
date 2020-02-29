import java.util.*;
import java.io.*;
public class A1294{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("/Users/allen/Desktop/Codeforces/txt.txt"));
		int n = scan.nextInt();
		for(int i =0 ; i < n ; i ++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int extra = scan.nextInt();



			int min = (Math.min(Math.min(a, b) , c));

			a -= min;
			b -= min;
			c -= min;

			//3, 1, 0
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(a);
			arr.add(b);
			arr.add(c);
			Collections.sort(arr);

			extra = extra - (arr.get(2) - arr.get(1)) - (arr.get(2)-arr.get(0));
			//System.out.println(extra);
			if(extra < 0){
				System.out.println("NO");
			}else{
			System.out.println(extra % 3 == 0 ? "YES" : "NO");
			}	



		}
 
	}
}