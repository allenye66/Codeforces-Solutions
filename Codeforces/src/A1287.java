import java.util.*;
import java.io.*;
public class A1287{
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("/Users/allen/Desktop/Codeforces/txt.txt"));
		int n = scan.nextInt();
		for(int j = 0; j < n; j ++){
			int s = scan.nextInt();
			char[] ch = scan.next().toCharArray();

			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(int i =0 ; i < s; i ++){
				if(ch[i] == 'A'){
					arr.add(i);
				}
			}
			if(ch[ch.length-1] == 'P'){
				arr.add(ch.length);
			}

			ArrayList<Integer> ooga = new ArrayList<Integer>();
			for(int i =0 ; i < arr.size()-1; i ++){
				ooga.add(arr.get(i+1)-arr.get(i));
			}
			ooga.add(0);

		//	System.out.println("first" + arr);
		//	System.out.println(ooga);
			Collections.sort(ooga);
			if(ooga.size() == 1 && ooga.get(0) == 0){
				System.out.println(0);
			}else{
			System.out.println(ooga.get(ooga.size()-1)-1);
		}

			/*
			if(ch[0] == 'P'){
				arr.remove(0);
			}
			if(arr.size() == 0){
				arr.add(0);
			}
			System.out.println("modified" + arr);

			if(arr.size() > 1){
			int maxP = 0;
			for(int i =0 ; i < arr.size()-1; i ++){
				if(arr.get(i+1) - arr.get(i)>maxP){
					maxP = arr.get(i+1) - arr.get(i);
				}
			}
			System.out.println(maxP);
			}else{
				System.out.println(arr.get(0));
			}*/
		}
	}

}