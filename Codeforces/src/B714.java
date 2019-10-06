import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList; 
 
public class B714{
    public static void main(String[] args) throws FileNotFoundException{
   	 
        Scanner scan = new Scanner(new File("txt"));
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i ++){
            arr[i] = scan.nextInt();
        }
 
    int counter = 0;
    
   
    ArrayList<Integer> diffNum = new ArrayList<>();
 
    for(int i=0; i<a; i++){
        if(!diffNum.contains(arr[i])){
            diffNum.add(arr[i]);
            counter ++;
            
            if(counter > 3){
                System.out.println("NO");
                System.exit(0);
            }
            
        }
    }
    int[] arr1 = new int[diffNum.size()];
    
    for (int i =0; i < diffNum.size(); i++) {
            arr1[i] = diffNum.get(i); 
    }
    if(arr1.length < 3){
        System.out.println("YES");
        System.exit(0);
 
   }
            
   // System.out.println(Arrays.toString(arr1));
   
   
 
     int temp;
    for (int i = 1; i < arr1.length; i++) {
    for (int j = i; j > 0; j--) {
     if (arr1[j] < arr1 [j - 1]) {
      temp = arr1[j];
      arr1[j] = arr1[j - 1];
      arr1[j - 1] = temp;
     }
    }
   }
   if(arr1[1] * 2 == arr1[0] + arr1[2]){
       System.out.println("YES");
       System.exit(0);
   }else{
       System.out.println("NO");
 
       System.exit(0);
      }
   
   
    
        System.out.println("YES");
        
   
 
        
    }
}