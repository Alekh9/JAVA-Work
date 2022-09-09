public class ClearLast_I_BitsOperations {
	public static int clearLast_I_Bit(int n, int i) {
		int bitMask = (~0) << i;
		return n & bitMask;
	}

	public static void main(String[] args) {
		System.out.println(clearLast_I_Bit(10, 2));
		System.out.println(clearLast_I_Bit(15, 2));
	}
}
