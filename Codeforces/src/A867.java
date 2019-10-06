import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A867{
    public static void main(String[] args) throws FileNotFoundException{
 
        Scanner scan = new Scanner(new File("txt"));
       
        int length = Integer.parseInt(scan.nextLine());
        String s = scan.nextLine();
        
        int ftos = 0;
        int stof = 0;
        
        for(int i = 0 ; i < length-1 ; i ++) {
        	if(s.charAt(i) == 'S' && s.charAt(i + 1) == 'F') {
        	stof ++;
        	}else if(s.charAt(i) == 'F' && s.charAt(i + 1) == 'S') {
            	ftos ++;
            }
        }
        if(stof > ftos) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
        
    }
}