package basics;

public class Strings {

	public static void main(String[] args) {
	String bookTitle;
	String wordchoice = "Ring";
	bookTitle = "The Lord of Ring";
	
	if (bookTitle.contains(wordchoice)) {
		System.out.println("This book contains ring");
	}
	
	String browser = "chrome";
	String App = "chrome";
		if (browser.contains(App))	{
			System.out.println("This is a chrome app");
					
		}
		
		String firstname = "Tim";
		String lastname = "Acheampong";
		String SSN = "123333";
		
		//print the initials plus last 4 digits of ss
	 System.out.print(firstname.substring(0,1));
	 System.out.println(lastname.substring(0, 1));
	 System.out.println(SSN.substring(2));
	}

}
