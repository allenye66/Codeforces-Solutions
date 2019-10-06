import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class A987 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int lines = Integer.parseInt(scan.nextLine());
		ArrayList<String> gauntlet =  new ArrayList<String>();
		gauntlet.add("red");
		gauntlet.add("purple");
		gauntlet.add("yellow");
		gauntlet.add("orange");
		gauntlet.add("blue");
		gauntlet.add("green");
		System.out.println(6 - lines);
		ArrayList<String> arr = new ArrayList<String>();
		while(scan.hasNextLine()) {
			
			arr.add(scan.nextLine());
			
		}
		for(int i = 0 ; i < lines; i++) {
			gauntlet.remove(arr.get(i));
		}
		for(int i =0 ; i < gauntlet.size(); i ++) {
			String s = gauntlet.get(i);
			if(s.equals("red")) {
				System.out.println("Reality");
			}if(s.equals("purple")) {
				System.out.println("Power");

			}if(s.equals("yellow")) {
				System.out.println("Mind");

			}if(s.equals("orange")) {
				System.out.println("Soul");

			}if(s.equals("blue")) {
				System.out.println("Space");

			}if(s.equals("green")) {
				System.out.println("Time");

			}
			
			
		}
	}
}