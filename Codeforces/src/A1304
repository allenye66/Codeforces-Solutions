import java.util.*;
import java.io.*;
public class 1304A{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =0 ; i < n; i ++){
            int xStart = scan.nextInt();
            int yStart = scan.nextInt();
            int xDelta = scan.nextInt();
            int yDelta = scan.nextInt();
            
            int sum = yStart - xStart;
            int step = xDelta + yDelta;
            if(sum%step== 0){
                System.out.println(sum/step);
            }else{
                System.out.println(-1);
            }
        }
        
    }
}