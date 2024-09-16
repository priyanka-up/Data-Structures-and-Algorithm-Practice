package Searching;
//find two no that add up to n
//since the sorting function we used in this code takes o(n(log(n)) and the 
//algo itself take o(n) time so overall time complexity of this code is o(n(log(n))

public class TwoSumUsingQuickSort {
	static QuickSort obj = new QuickSort();
	
	public static int[] findSum(int[] arr, int n)
	{
		
		QuickSort.quickSort(arr, 0, arr.length -1); //sort the array in asceding order
		
		int pointer1 =0;
		int pointer2 = arr.length -1;
		
		int[] result = new int[2];
		int sum =0;
		
		while(pointer1 != pointer2)
		{
		sum =	arr[pointer1] + arr[pointer2];
		
		if(sum < n)
		{
			pointer1++;
		}
		else if(sum > n)
			pointer2--;
		else
		{
			result[0] = arr[pointer1];
			result[1] = arr[pointer2];
			return result;
		}
		}
		return arr;	
	}

	public static void main(String[] args) {
		
		int n= 9;
		int[] arr1 = {2, 4, 5, 7, 8};
		int[] arr2 = findSum(arr1, 9);
		int num1 = arr2[0];
		int num2 = arr2[1];

		if ((num1 + num2) != n)
			System.out.println("Results not found!");
		else
		    System.out.println("Sum of " + n + " found: " + num1 + " and " + num2);

	}

}
