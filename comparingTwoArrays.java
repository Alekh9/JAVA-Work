import java.util.Scanner;
public class comparingTwoArrays
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array you want to store: ");
//reading the number of elements from the that we want to enter
		n = sc.nextInt();
//creates an array in the memory of length user input
		int[] arr1 = new int[n];
		int[] arr2 = new int[arr1.length];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n; i++)
		{
//reading array elements from the user
			arr1[i]=sc.nextInt();
		}
		System.out.println("Elements of original array A1 : ");
		for (int j : arr1) {
			System.out.print(j + " ");
		}
// making a duplicate array of original array
		System.out.println("making a copy of Original array A1 : " );
		System.arraycopy(arr1, 0, arr2, 0, arr2.length);
		System.out.println("Elements of Duplicate array A2 : " );
		for (int k : arr2) {
			System.out.print(k + " ");
		}
		System.out.println();
		if (arr1 == arr2) {
			System.out.println("Both array A1 and array A2 are EQUALS");
		} else {
			System.out.println("Both array A1 and array A2 are NOT EQUALS");
		}
	}
}