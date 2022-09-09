public class TilingProblem {
	public static int tilingProblemSolution(int n) {
		// Base Case
		if (n == 0 || n == 1) {
			return 1;
		}
		//Work Choice - Vertical
		int fnm1 = tilingProblemSolution(n-1);
		//Work Choice - Horizontal
		int fnm2 = tilingProblemSolution(n-2);
		int totWays = fnm1 + fnm2;
		return totWays;
	}

	public static void main(String[] args) {
		System.out.println(tilingProblemSolution(3));
		System.out.println(tilingProblemSolution(2));
		System.out.println(tilingProblemSolution(4));
	}
}
