import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A982{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = Integer.parseInt(scan.nextLine());
        String s = scan.nextLine();
        s = "0" + s + "0";
        System.out.println(s.contains("000")||s.contains("11")?"NO":"YES");
    }

}