import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class A784 {
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        int n = scan.nextInt();
        int[] arr = {4,22,27,58,85,94,121,166,202,265,274,319,346,355,378,382,391,438,454,483,517,526,535,562,576,588,627,634,636,645,648,654};
        System.out.println(arr[n-1]);
    }
}