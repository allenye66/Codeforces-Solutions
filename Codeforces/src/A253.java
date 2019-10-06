import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A253 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int b = scan.nextInt();
        int g = scan.nextInt();
        String str = "";
        if(b > g) {
        	 while(g != 0) {
             	b--;
             	g--;
             	str += "BG";
             }
        	 for(int i =0 ; i < b; i ++) {
        		 str += "B";
        	 }
        	 System.out.println(str);
        }else if ( g < b) {
        	 while(b != 0) {
              	b--;
              	g--;
              	str += "GB";
              }
         	 for(int i =0 ; i < g; i ++) {
         		 str += "G";
         	 }
         	 System.out.println(str);
        }else {
        	while(b != 0) {
              	b--;
              	g--;
              	str += "BG";
              }
        	 System.out.println(str);

        }
       
    }
}