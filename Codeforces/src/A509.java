import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A509 {

    public static void main(String[] args) throws FileNotFoundException 
    { 
		Scanner scan = new Scanner(new File("txt"));

        int n = scan.nextInt();
         
        int[] arr = {0,1,2,6,20,70,252,924,3432,12870,48620};
        System.out.println(arr[n]);
    } 
}
