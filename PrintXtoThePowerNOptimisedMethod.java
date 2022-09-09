public class PrintXtoThePowerNOptimisedMethod {
	public static int optimisedPower(int a, int n) {
		if (n == 0) {
			return 1;
		}
		int halfPower = optimisedPower(a, n/2);
		int halfPowerSq = halfPower * halfPower;
		//n is odd
		if(n%2 != 0) {
			halfPowerSq = a * halfPowerSq;
		}
		return halfPowerSq;
	}

	public static void main(String[] args) {
		int a = 2, n = 10;
		System.out.println(optimisedPower(a,n));
	}
}
