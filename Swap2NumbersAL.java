import java.util.ArrayList;

public class Swap2NumbersAL {
	public static void main(String[] args) {
		int idx1 = 1, idx2 = 3;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(78);
		list.add(39);
		list.add(45);
		list.add(73);
		list.add(10);
		System.out.println("Given Array list ");
		System.out.println(list);
		System.out.println();
		int temp = list.get(idx1);
		list.set(idx1, list.get(idx2));
		list.set(idx2,temp);
		System.out.println("After Swapping index 1 [" + idx1 + "] and index [" + idx2 + "] in Array list ");
		System.out.println(list);
	}
}
