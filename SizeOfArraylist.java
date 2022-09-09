import  java.util.*;
public class SizeOfArraylist {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(78);
		list.add(39);
		list.add(45);
		list.add(73);
		list.add(10);
		System.out.println(list.size());
		for (int i =0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
}
