public class UpdateIthBitOperations {

	public static int clearIthBit(int n, int i) {
		int bitMask = ~(1 << i);
		return n & bitMask;
	}

	public static int setIthBit(int n, int i) {
		int bitMask = 1 << i;
		return n | bitMask;
	}

	public static int updateIthBitFirstMethod(int n, int i, int newBit) {
		if (newBit == 0) {
			return clearIthBit(n, i);
		} else {
			return setIthBit(n, i);
		}
	}

	public static int updateIthBitSecondMethod(int n, int i, int newBit) {
		n = clearIthBit(n, i);
		int bitMask = newBit << i;
		return n | bitMask;
	}

	public static void main(String[] args) {
		System.out.println(updateIthBitFirstMethod(10, 2, 1));
		System.out.println(updateIthBitFirstMethod(100, 20, 10));
		System.out.println(updateIthBitSecondMethod(10, 2, 1));
		System.out.println(updateIthBitSecondMethod(100, 20, 10));
	}
}
