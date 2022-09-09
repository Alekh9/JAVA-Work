public class QuickSortAscendingOreder {
	public static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void quickSort(int arr[], int si, int ei) {
		if (si >= ei) {
			return;
		}
		// last element as pivot index
		int pivotIdx = partition(arr,si, ei);
		quickSort(arr, si, pivotIdx - 1); // left part (small elements)
		quickSort(arr, pivotIdx + 1, ei); // right part (Big elements)
	}

	private static int partition(int[] arr, int si, int ei) {
		int pivot = arr[ei];
		int i = si -1; // To make place for smaller element than pivot
		for (int j =si; j<ei; j++) {
			if (arr[j] <= pivot) {
				i++;
				//swap
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		// SWAP
		int temp = pivot;
		arr[ei] = arr[i];
		arr[i] = temp;
		return i;
	}

	public static void main(String[] args) {
		int arr[] = {6,3,9,5,2,8};
		quickSort(arr,0, arr.length - 1);
		printArr(arr);
	}
}
