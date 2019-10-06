import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class A546 
{
    public static void main(String[] args) throws FileNotFoundException{
    	 
        Scanner scan = new Scanner(new File("txt"));
        
        int cost = scan.nextInt();
        int money = scan.nextInt();
        int amount = scan.nextInt();
        
        int totalCost = 0;
        
        for(int i = 1 ; i < amount + 1; i ++){
            totalCost += cost * i;
        }
       // System.out.println(totalCost);
 
        if(money > totalCost)
        System.out.println(0);
        else
        System.out.println(totalCost-money);
    }
    
}