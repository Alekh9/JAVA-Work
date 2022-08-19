import java.util.Scanner;
public class ArrayInputExampleWithSorted
{
	public static void main(String[] args)
	{
		int n, temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the that we want to enter
		n=sc.nextInt();
//creates an array in the memory of length 10
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<n; i++)
		{
//reading array elements from the user
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//Sort the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		//Displaying elements of array after sorting
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}