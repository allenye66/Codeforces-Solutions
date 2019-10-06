import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A110{
    public static void main(String[] args) throws FileNotFoundException{
 
        Scanner scan = new Scanner(new File("txt"));
        String str = scan.nextLine();
        int counter = 0;
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) == '4' || str.charAt(i) == '7'){
                counter ++;
            }
        }
 
 
        if(counter == 4 || counter == 7){
            System.out.println("YES");
        }else{
 
 
       System.out.println("NO");
        }
    }
}