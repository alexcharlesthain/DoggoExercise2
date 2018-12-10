package doggoExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class DoggoPlacement {

	static final int limit = 100;

	public static void main(String[] args) {

		Scanner Placement = new Scanner(System.in);
		
		int a = Placement.nextInt();
		
		System.out.println(appender(100, a));
		
		Placement.close();
	}
	
	public static ArrayList<String> appender(int limit, int position) {
		
		ArrayList<String> doggoList = new ArrayList<>();
		
		for (int b = 1; b <= limit; b++) {
			
			if (b == position)
				continue;
			
			if (b % 100 >= 10 && b % 100 <= 20)
				doggoList.add(b + "th");
			
			else if (b % 10 == 1)
				doggoList.add(b + "st");
			
			else if (b % 10 == 2)
				doggoList.add(b + "nd");
			
			else if (b % 10 == 3)
				doggoList.add(b + "rd");
			
			else
				doggoList.add(b + "th");
		}

		return doggoList;
	}
	
	
}
