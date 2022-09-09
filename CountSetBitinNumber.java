public class CountSetBitinNumber {
	public static int countSetBit(int n) {
		int count = 0;
		while (n>0) {
			if((n & 1) != 0) { // checking Least significant bit (LSB)
				count++;
			}
			n &= n>>1;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countSetBit(8));
		System.out.println(countSetBit(15));
	}
}
