import java.util.ArrayList;

public class MaxInArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(78);
		list.add(39);
		list.add(45);
		list.add(73);
		list.add(10);
		int max = Integer.MIN_VALUE;
		System.out.println(list.size());
		for (int i =0; i<list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.print(max + " ");
	}
}
