import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A158 {
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] x = new int[n];
		int counter = 0;
      for(int i=0; i<n; i++)
       {
         x[i]= scan.nextInt();
       }
		
	
    
      	 for(int i=0;i<n;i++){
      	     if(x[i] >= x[k-1] && x[i] > 0){
      	        counter ++;
      	        }
            }
            System.out.println(counter);
        
	}
}