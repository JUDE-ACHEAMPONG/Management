package OOP;

public class UinvestApp {

	public static void main(String[] args) {
		// Creating a new bank account think instantiate an object

		//acct1.name = "Jude";
		//encapsulation : public API method
		
		BankAccount acct1 = new BankAccount();
		acct1.setName("Owusu");
		System.out.println(acct1.getName());
		
		acct1.setSSN("1323525");
		System.out.println(acct1.getSSN());
		
		acct1.accountNumber = "1234567";
		
		acct1.balance = 10000;
		acct1.setRate();
		acct1.increaseRate();
		
		System.out.println();
		
		acct1.deposit(5000);
		acct1.deposit(3000);
		
		//polymohise through overriding
		System.out.println(acct1.toString());
	
		
		System.out.println();
		
		//polymorphise through overloading
		BankAccount acct2 = new BankAccount("Checking Account");
		acct2.accountNumber = "2345678";
		
		
		
		BankAccount acct3 = new BankAccount("Saving Account",6000);
		acct3.accountNumber = "3456789";
		acct3.Statement();
	
		
		//Demo for inheritance
		CDaccount cd1 = new CDaccount();
		cd1.balance = 5000;
		cd1.interestrate = "4.5";
		//cd1.name = "jude";
		cd1.accounttype = "CD Account";
		cd1.toString();
		System.out.println(cd1.toString());
		cd1.compound();
		
			}

}
