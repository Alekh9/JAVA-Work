import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PairSumInSortedAndRotatedAL {
	public static boolean pairSum2PointerApproach(ArrayList<Integer> lists, int targets) {
		Arrays.sort(new ArrayList[]{lists});
		int breakingPoint = -1;
		int n = lists.size();
		for (int i=0; i<lists.size(); i++) {
			if (lists.get(i) > lists.get(i+1)) {
				breakingPoint = 1;
				break;
			}
		}
		int leftPointer = breakingPoint + 1; // smallest
		int rightPointer = breakingPoint; // largest
		while (leftPointer < rightPointer) {
			//   CASE 1
			if (lists.get(leftPointer) + lists.get(rightPointer) == targets) {
				return true;
			}
			//    CASE 2
			if (lists.get(leftPointer) + lists.get(rightPointer) < targets) {
				leftPointer = (leftPointer + 1) % n;
			}
			// CASE 3
			else {
				rightPointer = (n + rightPointer - 1) % n;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int target1 = 5;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(10);
		list.add(4);
		list.add(9);
		list.add(3);
		list.add(7);

		System.out.println("2 Pointer Approach Method - " + target1 +
				" exits in sum of pairs in given Arraylist is ----- " + pairSum2PointerApproach(list, target1));
	}
}
