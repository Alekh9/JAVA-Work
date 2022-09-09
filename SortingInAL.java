import java.util.ArrayList;
import java.util.Collections;

public class SortingInAL {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(78);
		list.add(39);
		list.add(45);
		list.add(73);
		list.add(10);
		System.out.println("Given Array list ");
		System.out.println(list);
		System.out.println("ArrayList in ascending Order");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Arraylist is descending order");
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}
}
