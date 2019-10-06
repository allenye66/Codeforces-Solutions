/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B1104 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		
		
		 
		String str = scan.nextLine();
		if(allCharactersSame(str)) {
			//System.out.println("all same");
			if(str.length() % 2 == 0) {
				if(str.length() % 4 == 0) {

					System.out.println("No");
					System.exit(0);
				}else {
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}
		int c = 0;
		while(containsDouble(str)) {
			c ++;
			str = removeDouble(str);
		}
		if(c % 2 == 0) {
			
			System.out.println("No");

		}else {
			System.out.println("Yes");
		}
		
		
		
			int r = recursion(str, 0);
			if(r % 2 == 0) {
				System.out.println("No");

			}else {
				System.out.println("Yes");
			}
		}
		
	}

		static int recursion(String s, int counter) {
			if (!containsDouble(s)) {
				// System.out.println(counter);
				return counter;
			}
			return recursion(removeDouble(s), counter + 1);
		}

		static String removeDouble(String s) {
			ArrayList<String> arr = new ArrayList<String>();
			char[] bar = s.toCharArray();
			for (int i = 0; i < bar.length; i++) {
				arr.add(bar[i] + "");
			}
			// System.out.println("ooga" + arr);
			for (int i = 0; i < s.length() - 1; i++) {
				if (arr.get(i).equals(arr.get(i + 1))) {
					// System.out.println("True " + arr.get(i) + " " + arr.get(i + 1) + " " + i + "
					// " + ( i + 1));
					arr.remove(i);
					arr.remove(i);
					return convertArrToString(arr);

				}
			}
			return s;
		}

		private static String convertArrToString(ArrayList<String> arr) {
			String temp = "";

			for (int j = 0; j < arr.size(); j++) {
				temp += arr.get(j);
			}
			return temp;
		}

		static boolean containsDouble(String s) {
			for (int i = 0; i < s.length() - 1; i++) {
				if (s.charAt(i) == s.charAt(i + 1)) {
					return true;
				}
			}
			return false;
		}

		static boolean allCharactersSame(String s) {
			int n = s.length();
			for (int i = 1; i < n; i++)
				if (s.charAt(i) != s.charAt(0))
					return false;

			return true;
		}
}
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B1104 {
	static ArrayList<String> arr = new ArrayList<String>();
	static Set<String> set = new HashSet<>();

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("txt"));
		String s = scan.nextLine();
		
		allPalindromicSubStrings(s);
		arr.addAll(set);
		//System.out.println(arr);

		for(int i = 0 ; i < arr.size(); i ++) {
			if(arr.get(i).length() < 2) {
				arr.remove(i);
				i --;
			}
		}
		Comparator<String> c = new Comparator<String>()
	    {
	        public int compare(String s1, String s2) {
	            return Integer.compare(s1.length(), s2.length());
	        }
	    };
	    Collections.sort(arr, c);

		//System.out.println(arr);
		String result = "";
		int counter = 0;
		for(int i =arr.size() - 1 ; i >= 0; i --) {
			String str = arr.get(i);
			
			result = result.replaceFirst(str, "");
			counter ++;
		}

		if(counter % 2 == 0) {
			System.out.println("No");
 
		}else {
			System.out.println("Yes");
		}
		
		
		/*String str = scan.nextLine();
		
		char[] bar = str.toCharArray();
		for(int i = 0 ; i < bar.length; i ++) {
			arr.add(bar[i] + "");
		}
		int c = 0;
		while(containsDouble()) {
			for(int i = 0 ; i < arr.size()-1; i ++) {
				if(arr.size() == 0) {
					break;
				}
				if(arr.get(i + 1).equals(arr.get(i ))) {
					c ++;
					arr.remove(i);
					arr.remove(i);
				}
			//	System.out.println(arr);
			}

		}
			System.out.println(c);
		if(c % 2 == 0) {
			
			System.out.println("No");

		}else {
			System.out.println("Yes");
		}
	}
	static boolean containsDouble() {
		for(int i =0 ; i < arr.size()-1; i ++) {
			if(arr.get(i).equals(arr.get(i + 1))) {
				return true;
			}
		}
		return false;
	}

*/
	}
	public static void expand(String str, int low, int high, Set<String> bet)
	{
		while (low >= 0 && high < str.length()
				&& str.charAt(low) == str.charAt(high))
		{
			bet.add(str.substring(low, high + 1));
			low--;
			high++;
		}
	}
	public static void allPalindromicSubStrings(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{			
			expand(str, i, i, set);
			expand(str, i, i + 1, set);
		}		
	}
	
}
		
