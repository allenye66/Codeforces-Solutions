import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A245 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        
        int n = scan.nextInt();
        int ar = 0;
        int al = 0;
        int br = 0;
        int bl = 0;
        for(int i =0 ; i < n ; i ++) {
        	int server = scan.nextInt();
        	int received = scan.nextInt();
        	int left = scan.nextInt();
        	//System.out.println(server + " " + received + " " + left);
        	if(server == 1) {
        		ar += received;
        		al += left;
        		//System.out.println(ar + " " + al);
        	}else {
        		br += received;
        		bl += left;
        	//	System.out.println(br + " " + bl);


        	}
        	
        }
        int asum = ar + al;
        int bsum = br + bl;

       //System.out.println(ar + " " + asum);
       //System.out.println(br + " " + bsum);

        if(ar >= asum/2) {
        	System.out.println("LIVE");
        }else {
        	System.out.println("DEAD");
        }
        if(br >= bsum/2) {
        	System.out.println("LIVE");
        }else {
        	System.out.println("DEAD");
        }
    }
    
}