package basics;

public class SalaryCalculator {
	
	public static void main(String[] args) {
		//create a variable to define our career
		//declare a variable
		String career;
		System.out.println("Program is starting");
		career = "developer";
		System.out.println("My career: " + career);
		
		//declare and define
		int HoursPerweek = 40;
		int WeeksPeryear = 50;
		double rate = 40;
		career = "Web developer";
		
		double salary = HoursPerweek * WeeksPeryear * rate;
		System.out.println("My salary as a " +  career + " at the rate of $" + rate + " is $" + salary + " per year");
		
				
		//compute our annual salary
		//rate * hoursPerweek * weeksPeryear
		
	}

}
