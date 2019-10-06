import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A25{
	   public static void main(String[] args) throws FileNotFoundException{
	    	 
	    Scanner scan = new Scanner(new File("txt"));
        int x = scan.nextInt();
        int[] arr  = new int[x];
        for(int i = 0 ;i < x; i ++){
            arr[i] = scan.nextInt();
        }
        int odd = 0;
        int even = 0;
        for(int i = 0 ; i < arr.length; i ++){
            if(arr[i] %2 == 0){
                even ++;
            }else{
                odd++;
            }
        }
        int index = 0;
        if(even < odd){
            for( int i = 0 ; i < arr.length; i ++){
                if(arr[i] %2 == 0){
                    index = i +1;
                }
            }
        }
        if(odd < even)  {
             for( int i = 0 ; i < arr.length; i ++){
                if(arr[i] %2 == 1){
                    index = i +1;
                }
            }
        }
        
        System.out.println( index);
    }
 
}
 