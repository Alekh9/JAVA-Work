public class FriendsPairingProblemSolutions {
	public static int friendsPairing(int n) {
		if (n == 1||n == 2) {
			return n;
		}
		// Choice - Singles
		int fnm1 = friendsPairing(n-1);
		// Choice - Pairs
		int fnm2 = friendsPairing(n-2);
		int pairWays = (n-1) * fnm2;
		// Total Ways
		int totalWays = fnm1 + pairWays;
		return totalWays;
	}

	// OPTIMISED METHOD
	public static int optimesdMethod(int n) {
		return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(friendsPairing(3));
		System.out.println(optimesdMethod(3));
	}
}
