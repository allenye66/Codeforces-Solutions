import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A479{
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
        int a  = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int total = 0;
        
        if(a == 1||b == 1 || c ==1){
            if(a == 1 && b == 1 && c == 1){
                total = 3;
            }
            //single number is 1
            if(a == 1 && b != 1 && c != 1){
                total = (a +b) * c;
                
            }
            if(a != 1 && b == 1 && c != 1){
                if(c > a){
                    total = (a + b) * c;
                }else{
                    total = a* (b + c);
                }
            }
            if(a != 1 && b != 1 && c == 1){
                total = a * (b +c);
            }
            //if 2 numbers are 1
            if(a == 1 && b == 1 && c != 1){
                total =2* c;
                
            }
            if(a == 1 && b != 1 && c == 1){
                total = a + c+ b;
                
            }
            if(a != 1 && b == 1 && c == 1){
                total = 2*a;
                
            }
    
        }
        else{
           total = a * b * c;
        }
        System.out.println(total);
    }
}