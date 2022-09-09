public class CheckArrayIsSoretedOrNot {
	public static boolean isSorted(int ar[], int i) {
		if(i == ar.length - 1) {
			return true;
		}
		if(ar[i] > ar[i + 1]) {
			return false;
		}
		return isSorted(ar, i+1);
	}

	public static void main(String[] args) {
		int ar[] = {1,2,3,4};
		System.out.println(isSorted(ar,0));
	}
}
