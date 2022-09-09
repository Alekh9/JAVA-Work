public class Powerof2OrNot {
	public static boolean isPowerOf2OrNot(int n) {
		return (n & (n - 1)) == 0;
	}
	public static void main(String[] args) {
		System.out.println(isPowerOf2OrNot(8));
		System.out.println(isPowerOf2OrNot(7));
	}
}
