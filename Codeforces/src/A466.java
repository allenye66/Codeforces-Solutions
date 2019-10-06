import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A466 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("txt"));
		int rides = scan.nextInt();
		int specialRide = scan.nextInt();
		int oneRide = scan.nextInt();
		int specialCost = scan.nextInt();
		
		int specialCostPerRide = specialCost/specialRide;
		boolean specialBetter = specialCostPerRide < oneRide;
		
		
		//either buy all single tickets
		//buy some special, some regular
			//if the tickets left * single is less than a single special ticket
		//all special 
			// if tickets left * single is greather than a single special
		
		int ticketsMod = rides%specialRide;
		if(!specialBetter) {
			System.out.println(oneRide * rides);
			System.out.println("ooga");
			System.exit(0);
		}else if(specialBetter) {
			if(ticketsMod * oneRide < specialCost) {
				int cost = 0;
				int buh = rides/specialRide;
				rides -= buh * specialRide;
				cost += specialCost * buh;
				
				int guh = rides % specialRide;
				cost += guh * oneRide;
				System.out.println(cost);
				System.out.println("booga");
				System.exit(0);
				
			}else {
				System.out.println((rides/specialRide + 1) * specialCost);
				
				System.exit(0);
			}
		}
		
	
	}
}