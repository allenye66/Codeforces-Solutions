import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A785 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int lines = Integer.parseInt(scan.nextLine());
		int faces = 0;
		for (int i = 0; i < lines; i++) {
			String s = scan.nextLine();
			if (s.equals("Tetrahedron")) {
				faces += 4;
			} else if (s.equals("Cube")) {
				faces += 6;
			} else if (s.equals("Octahedron")) {
				faces += 8;
			} else if (s.equals("Dodecahedron")) {
				faces += 12;
			} else {
				faces += 20;
			}

		}
		System.out.println(faces);

	}
}