package basics;

public class lab1 {

	public static void main(String[] args) {
		// write a function that takes a value n and returns the sum of 1 to n
		System.out.println(sum(4));
		
		//write a function that computes the factorial
		System.out.println(factorial(4));
		
		//write a function that return min, avg, array
		int[] numbers = {3, -2, 5, 33, 335,-334};
		System.out.println("Min " + findmin(numbers));
		System.out.println("Max" + findmax(numbers));
		System.out.println("Avg" + findavg(numbers));
		}
	
	public static int findavg(int[] arr) {
		int sum = 0;
		for (int n=0; n < arr.length; n++) {
			sum = sum + arr[n];
					
		}
		
		return sum/arr.length;
		
	}
	
	
	public static int findmin(int[] arr) {
		int min = arr[0];
		for (int i =0; i < arr.length; i++) {
			if (arr[i] < min){
				min = arr[i];
				
			}
				
			}
		return min;
		
	}
	
	public static int findmax(int[] arr) {
		int max = arr[0];
		for (int i =0; i < arr.length; i++) {
			if (arr[i] > max){
				max = arr[i];
				
			}
				
			}
		return max;
	}
	
	
	
		public static int sum(int n) {
			int sum = 0;
			for(int i = 1; i <=n; i++) {
				sum = sum + i;
			
			}
			return sum;
					
		}
		
		public static int factorial(int n) {
			
			if (n == 0) {
				return 1;
				
			}
			return factorial(n-1)*n;
			
		}
		
		
	}


