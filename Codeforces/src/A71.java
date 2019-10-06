import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class A71 {
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
		int n = scan.nextInt();
		
      	for(int i=0;i<n;i++){
 
        String a = scan.next();
 
        if(a.length() > 10){
            System.out.print(a.charAt(0));
			System.out.print(a.length() -2); 
			System.out.println(a.charAt(a.length() -1));
        }
        else{
           System.out.println(a);
        }
      	}
    }
}