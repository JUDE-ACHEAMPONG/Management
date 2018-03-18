package basics;

public class Cities {
	public static void main(String[] args) {
		
		String[] cities = {"New York","San Fran", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		
		
		String[] countries;
		
		countries = new String[2];
		countries[0] = "USA";
		countries[1] = "Ghana";
		System.out.print(countries[1]);
		
		System.out.println("*****");

		String[] states = new String[5];
		states[0]= "Utah";
		states[1]= "South Carolina";
		states[2]= "North Carolina";
		states[3]= "Seattle";
		states[4]= "California";
		int i = 0;
		do {
			System.out.println(states[i]);
			i= i + 1;
			
		} while (i < 5);
	
		System.out.println("^^^");
		
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.print(state);
			
			System.out.println("\n");
			
			if (state == "South Carolina") {
			
			System.out.println("This is Columbia");
			stateFound = true;
			}
			n++;
			
			//for loop best structure for arrays
			
			
			
		}
		
		System.out.println("Printing with for loop");
	for (int x = 0; x < 5; x++) {
		System.out.println(states[x]);
	}
	
		
		
			
		
	}

}
