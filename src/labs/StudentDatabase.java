package labs;

public class StudentDatabase {

	public static void main(String[] args) {
			Database acct1 = new Database ("123232323", 1000);
			Database acct2 = new Database ("223233323", 2000);
			
			acct1.setUserID();
			acct1.setName("Jude");
			System.out.println(acct1.getName());
			acct1.payCost(200);
			System.out.println(acct1.toString());
			
			System.out.println("");
			
			acct2.setUserID();
			acct2.setName("Jake");
			System.out.println(acct2.getName());
			acct2.payCost(300);
			System.out.println(acct2.toString());
			
			acct1.setEmail();
			
				
	}
	
}
	
	class Database {
		private static int ID; 
		private String ssn;
		private String name;
		private String email; //name @ university.edu
		private String userID; //ID + random 4 digit + last 4 ssn
		private double balance;
		
		
		//constructor
		public Database(String ssn, double intDeposit){
			balance = intDeposit;
			System.out.println("New Student Enrolled");
			this.ssn = ssn;
			ID++;
			System.out.println(ID);
			setUserID();
			setEmail();
			
				
		
		}
		
		public void setUserID() {
			int random = (int) (Math.random() * 10000);
			System.out.println("Random: " + random);
			userID = ID + random + ssn.substring(5);
			System.out.println("New ID: " + userID);
			
		}
		
		public void setName(String name) {
			this.name = name;
				
		}
		public String getName() {
			return name;
			
				}
		
		
		public void payCost(int amount) {
			balance = balance - amount;
			System.out.println("Student Balance after draft:" + balance);		
		}
		
		public void setEmail() {
			email = name + "@university.edu";
			System.out.println("Your email:"+ email);
		}
		
		@Override
		public String toString() {
			return "[Name: " + name + "]\n" + "[Balance: " + balance + "]\n" + email;
			
			
		}
			
	}


