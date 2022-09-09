public class SearchInRotatedSortedArray {
	public static int search(int arr[], int tar, int si, int ei) {
		if (si > ei) {
			return -1;
		}
		//KAAM WORK
		int mid = si + (ei - si)/2; // (si+ei)/2
		if (arr[mid] == tar) {
			return mid;
		}
		// Case found (mod on Line 1)
		if (arr[si] <= arr[mid]) {
			//case a : Left;
			if (arr[si] <= tar && tar <= arr[mid]) {
				return search(arr, tar, si, mid-1);
			} else  {
				return search(arr, tar, mid+1, ei);
			}
		}
		// Case found (mid on Line 2)
		else {
			if (arr[mid] <= tar && tar <= arr[ei]) {
				return search(arr, tar, mid+1, ei);
			} else {
				return search(arr, tar, si, mid-1);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {4,5,6,7,0,1,2};
		int target = 0;
		int tarIdx = search(arr, target,0,arr.length - 1);
		System.out.println(tarIdx);
	}
}
