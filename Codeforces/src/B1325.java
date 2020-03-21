import java.util.*;
import java.io.*;
public class B1325{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("/Users/allen/Desktop/Codeforces/txt.txt"));
        long n = scan.nextLong();
        for(long i = 0 ; i < n ; i ++){
            int length = scan.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int j = 0; j < length; j ++){
                int b = scan.nextInt();
                arr.add(b);

            }
            HashSet<Integer> set = new HashSet<Integer>(arr);
            
            System.out.println(set.size());
           }
        
    }

}