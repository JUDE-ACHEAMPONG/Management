package basics;

public class Weather {
	public static void main(String[] args) {
		//This program will give suggestion of what to wear based on the weather (temperature)
		//Test sun condition
		String Weather = "Hot";
				
		int Temperature = 55;
		
		System.out.println(Temperature);
		
		if (Temperature > 80) {
			System.out.println("It's pleasant, wear shorts and T Shirt");
				
		}
		
		else if ((Temperature > 60) && (Weather == "Hot")) {
			System.out.println("It's a little cooler, you should wear a light jacket");
			System.out.println("Its cooler and the weather is nice");
	}
		else if ((Temperature > 50) || (Weather == "Hot")) {
			System.out.println("Its overcast");
		}
		else {
			System.out.println("Its very cold, bring a sweater");
		}
		System.out.println("The program is ending");
	}

}
