import java.util.*;
import java.io.*;
public class A80{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("/Users/allen/Desktop/Codeforces/txt.txt"));
		int a = scan.nextInt();
		int b = scan.nextInt();

		a++;
		for(int i = 0; i < 100; i ++){
			if(!isPrime(a)){
				a += 1;
			}
		}
		
	//	System.out.println("a: " + a);
	//	System.out.println("b: " + b);

		System.out.println( a== b ? "YES": "NO");




	}
	public static boolean isPrime(int num){

		for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
	}

}