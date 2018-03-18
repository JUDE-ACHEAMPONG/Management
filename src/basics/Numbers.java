package basics;

public class Numbers {
	
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printname();
		int numa = 10;
		int numb = 13;
		addnumbers(numa,numb);
		System.out.println("Product is " + multiplynumbers(numa, numb));
		int product = multiplynumbers(numa, numb);
		
		
	}
	
	static void printname() {
		
		System.out.println("My name is Jude");
	}
	
	static void addnumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("This is the sum of " + numberA + " and " + numberB + " is " + sum);
		
	}
	
	static int multiplynumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addnumbers(product, product);
		
		return product;
		
		
		
	}
	

}
