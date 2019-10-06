import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A133{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        String str = scan.nextLine();
        int sum = 0;
        if(str.equals("Q")){
            sum ++;
 
        }
        if(str.equals("+Q")){
            sum ++;
 
        }
        if(str.equals("H")){
            sum ++;
 
        }
        
        if(str.equals("9")){
            sum ++;
 
        }
        if(str.substring(str.length() -1, str.length()).equals("H")){
            sum ++;
        }
        
        
        
        
        
        for(int i  = 0; i < str.length()-1; i ++){
            if(str.substring(i, i + 1). equals("Q")){
              sum ++;
            }
            if(str.substring(i, i + 1). equals("H")){
                sum ++;
            }
            
          
            if(str.substring(i, i + 1). equals("9")){
                sum ++;
            }
        }
        if(sum > 0){
                  System.out.println("YES");
 
        }else{
        System.out.println("NO");
        }
    }
}