public class AllOOccurrenceElementsInArray {
	public static int allOccurence(int arr[], int key, int i) {
		if (i == arr.length) {
			return -1;
		}
		if(arr[i] == key) {
			System.out.print(i + " ");
		}
		return allOccurence(arr, key, i+1);
	}
	public static void main(String[] args) {
		int arr[] = {8,3,5,9,5,10,2,5,3,5,5};
		System.out.println(allOccurence(arr, 5, 0));
	}
}
