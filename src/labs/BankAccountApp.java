package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acct1 = new BankAccount ("234343434", 1000);
		
		
		acct1.setName("Jude");
		System.out.println(acct1.getName());
		acct1.makeDeposit(250);
		acct1.makeDeposit(400);
		acct1.payBill(300);
		acct1.accrue();
		System.out.println(acct1.toString());
		
		
	}

}


class BankAccount implements IInterest {
	//properties of bank Account
	private static int ID = 1000;
	private String accountNumber; // ID + randon 2 digits + first 2 of ssn
	private static final String routingNumber = "3333333";
	private String name;
	private String ssn;
	private double balance;
	
//constructor
	public BankAccount(String ssn, double intDeposit) {
		balance = intDeposit;
		System.out.println("Bank Account Opened");
		this.ssn = ssn;
		ID++;
		System.out.println(ID);
		setAccountNumber();
				
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		System.out.println(random);
		accountNumber = ID + "" + random + ssn.substring(0, 2);
		System.out.println("Account Number is " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return name;
		
	}
	
	public void payBill(double amount) {
	balance = balance - amount;
	System.out.println("Paybill " + amount);
	showBalance();
	
	}
		
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit "+ amount);
		showBalance();
			
	}
	
	public void showBalance() {
		System.out.println("Balance " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate / 100);
		System.out.println("Accrue " + balance);
		showBalance();
		
		
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[accountNumber: " + accountNumber + "]\n" + "[Routing number: " + routingNumber + "]\n" + "Balance: " + balance + "]";
		
			
		
	}
	
	
	
	
}