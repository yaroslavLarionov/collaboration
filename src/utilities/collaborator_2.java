
public class collaborator_2 {
	public static void main(String[] args) {
		
		fib(3); // -> 0 1 1
		fib(5); // -> 0 1 1 2 3
		fib(6); // -> 0 1 1 2 3 5
		fib(10); // -> 0 1 1 2 3 5 8 13 21 34
		
		
	}

	public static void fib(int n) {
		int firstNumber = 0;
		int secondNumber = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(firstNumber + " ");
			int sum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;

		}
		System.out.println();
	}

}
