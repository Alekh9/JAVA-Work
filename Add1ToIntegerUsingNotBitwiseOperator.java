public class Add1ToIntegerUsingNotBitwiseOperator {
	public static int addOneFirstMethod(int x) {
		int m = 1;
		// Flip all the set bits, until we find a 0
		while( (int)(x & m) >= 1) {
			x = x ^ m;
			m <<= 1;
		}
		// flip the rightmost 0 bit
		x = x ^ m;
		return x;
	}

	public static int addOneSecondMethod(int x) {
		//System.out.println(x + " + " + 1 + " is " + -~x);
		return -~x;
	}

	public static void main(String[] args) {
		System.out.println(addOneFirstMethod(13));
		System.out.println(addOneFirstMethod(-4));
		System.out.println(addOneFirstMethod(0));
		System.out.println(addOneSecondMethod(13));
		System.out.println(addOneSecondMethod(-4));
		System.out.println(addOneSecondMethod(0));
	}
}
