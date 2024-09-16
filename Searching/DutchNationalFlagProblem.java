package Searching;

import java.util.Arrays;

public class DutchNationalFlagProblem {
	
	// //sorting in ascending order using selection sort
	public static int[] selectionSort(int[] arr)
	{
		int size = arr.length;
		int index =0;
		for(int i=0; i< size; i++)
		{
			////finding the minimum value's index
			index = find_min(arr, i,size);
			
			//swapping it with current value
			int temp =0;
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		return arr;
	}
	
	////function to find the index of the minimum value  
	public static int find_min(int[] arr, int start, int end)
	{
		int min = arr[start];
		int index = start;
		
		for(int i=start; i<end; i++)
		{
			if(arr[i] < min)
			{
			min = arr[i];
			index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {
				   2,
				   0,
				   0,
				   1,
				   2,
				   1
				  };
		System.out.print(Arrays.toString(selectionSort(arr)));
	}

}




//The time complexity is also too high, i.e. O(n^2)