package OOP;

public class BankAccount implements IRate {
	//define variable
	String accountNumber;
	//static belongs to class not object
	//final is constant can not add to multiple variables to an object acct1 and acct2
	private static final String routingNumber = "203334";
	
	//instance variable
	private String name;
	private String ssn;
	String accounttype;
	double balance = 0;
	
	//constructor definitions
	//1.used to define, setup and initialize properties of an object
	//2.they are implicitly called upon instantiation
	//3.The same name as the class its self
	//4.Constructors have now return type
	
	BankAccount(){
		System.out.println("New Account Created");
		
	}
	//overloading; call same method name with different argument
	BankAccount(String accounttype){
		System.out.println("New Account:" + accounttype);
		
	}
	BankAccount(String accounttype, double initDeposit){
		System.out.println("New Account:" + accounttype);
		System.out.println("INITIAL DEPOSIT:" + initDeposit);
		String message = null;
		if (initDeposit < 1000) {
			message = "Error: Min Deposit must be 1000";
			
		} else {
			message = "Thanks for your initial deposit of: $" + initDeposit;
		}
			
		System.out.println(message);
		balance = balance + initDeposit;
		
	}
	
	//Getters / Setters
	//name - allow the user to define the name
	public void setName(String name) {
		this.name = "Mr." + name ;
		
	}
	public String getName() {
	return name;	
		
	}
	
	//private SSN
	public void setSSN(String ssn) {
		this.ssn = ssn;
		
	}
	public String getSSN( ) {
		return ssn;
	}
	
	//Interface methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	
	//define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showactivity("Deposit");
		
	}
	
	void invest(double amount) {
		balance = balance + amount;
		showactivity("Invest");
		
	}
	
	private void showactivity(String activity) {
		System.out.println("Your recent activity " + activity);
		System.out.println("Your new Balance is: " + balance);
	}
	
	void Statement() {
		System.out.println("Balance = " + balance);
		
	}
	
	void status() {
		
	}
	@Override
	public String toString() {
		return "[ Name " + name + ", Accoutnum:" + accountNumber + "Balance: " + balance + "]";
		
		
	}
}
