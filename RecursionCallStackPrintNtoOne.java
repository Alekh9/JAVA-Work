public class RecursionCallStackPrintNtoOne {
	public static void printDecrease(int n) {
		if(n == 1) {
			System.out.println(n);
			return;
		}
		System.out.print(n + " ");
		printDecrease(n-1); // Recursion
	}
	public static void main(String[] args) {
		int n = 10;
		printDecrease(n);
	}
}