public class BackTrackingInArrays {
	public static void changeArr(int arr[], int i, int val) {
		//base Case
		if (i == arr.length) {
			printArr(arr);
			return;
		}
		//recursion
		arr[i] = val;
		changeArr(arr, i+1, val+1);
		arr[i] = arr[i] - 2;
	}
	private static void printArr(int[] arr) {
		for (int i =0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args) {
	int arr[] = new int[5];
	changeArr(arr, 0 ,1);
		System.out.println();
	printArr(arr);
	}
}