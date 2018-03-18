package OOP;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating " + email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
		
	}
	
}


public class Demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "Joe@testemail.com";
		person1.phone = "1112333";
		
		
		//abstractions
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "Jude";
		person2.email = "Jude@test.com";
		person2.phone = "1223443";
		
		// person
		
		//Attributes, variable, adjectives
		String name = "Joe";
		String email = "Joe@testemail.com";
		String phone = "1234567655";	
		
		//Action, activity, behavior
		//System.out.println(name + " is walking");
		walking(name);
				
		// for second person Attributes, variable, adjectives
				String name2 = "Jude";
				String email2 = "Jude@testemail.com";
				String phone2 = "2234567655";	
				
				//Action, activity, behavior
				//System.out.println(name2 + " is walking");
				walking(name2);
				
				//binding attributes together
				
				
	}
	
	//add function
	static void walking(String name) {
		System.out.println(name + " is walking");
			
			}

}
