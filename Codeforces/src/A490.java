import java.util.*;
import java.io.*;
public class A490{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("/Users/allen/Desktop/Codeforces/txt.txt"));
		int n = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int ones= 0;
		int twos = 0;
		int threes = 0;
		for(int i =0 ; i <n ; i ++){
			int temp = scan.nextInt();
			if(temp == 1){
				ones ++;
			}else if(temp == 2){
				twos ++;
			}else{
				threes ++;
			}
			arr.add(temp);
		}
		
		int maxTeams = Math.min(ones, Math.min(twos, threes));
		if(maxTeams == 0){
			System.out.println(0);
			System.exit(0);
		}
		ArrayList<Integer> used = new ArrayList<Integer>();
		ArrayList<Integer> onesArray = new ArrayList<Integer>();
		ArrayList<Integer> twosArray = new ArrayList<Integer>();
		ArrayList<Integer> threesArray = new ArrayList<Integer>();

		for(int i = 0 ; i < arr.size(); i ++){
			if(arr.get(i) == 1){
				onesArray.add(i+1);
			}else if(arr.get(i) == 2){
				twosArray.add(i+1);
			}else{
				threesArray.add(i+1);
			}
		}
		/*System.out.println(onesArray);
		System.out.println(twosArray);
		System.out.println(threesArray);
		*/
		System.out.println(maxTeams);

		for(int i =0 ; i < maxTeams; i ++){
			System.out.println(onesArray.get(i) + " " + twosArray.get(i) + " " + threesArray.get(i));
		}



	}
}