public class SumOfFirstnNaturalNumbers {
	public static int calcsum(int n) {
		if(n == 1) {
			return 1;
		}
		int sumnm1 = calcsum(n - 1);
		int sn = n + sumnm1;
		return sn;
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(calcsum(n));
	}
}
