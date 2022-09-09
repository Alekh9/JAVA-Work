import java.util.ArrayList;
import java.util.Arrays;

public class PairSum1SortedAL {
	public static boolean pairSum1BruteForceMethod(ArrayList<Integer> list, int target) {
		for (int i=0; i< list.size(); i++) {
			for (int j=i+1; j< list.size(); j++) {
				if (list.get(i) + list.get(j) == target) {
					return true;
				}
			}
		}
		return false;
	}

		// 2 PoINTER APPROACH ---- OPTIMISED METHOD

	public static boolean pairSumOne2PointerApproach(ArrayList<Integer> lists, int targets) {

		int leftPointer = 0;
		int rightPointer = lists.size()-1;
		while (leftPointer < rightPointer) {
			//   CASE 1
			if (lists.get(leftPointer) + lists.get(rightPointer) == targets) {
				return true;
			}
			//    CASE 2
			if (lists.get(leftPointer) + lists.get(rightPointer) < targets) {
				leftPointer++;
			}
			// CASE 3
			else {
				rightPointer--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int target1 = 5;
		int target2 = 99;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(9);
		list.add(3);
		list.add(7);
		Arrays.sort(new ArrayList[]{list});
		System.out.println(list);
		/*System.out.println("Brute Force Method - " + target1 +
				" exits in sum of pairs in given Arraylist is ----- " + pairSum1BruteForceMethod(list, target1));*/
		System.out.println();
		System.out.println("2 Pointer Approach Method - " + target1 +
				" exits in sum of pairs in given Arraylist is ----- " + pairSumOne2PointerApproach(list, target1));
	}
}
