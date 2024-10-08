package Searching;

import java.util.Random;

//Sort the array in ascending order

public class QuickSort {
	static Helper obj = new Helper();
	
	public static int choosePivot(int left, int right)
	{
		Random rand = new Random();
		//pick 3 random no within the range of array
		
		int i1 = left + (rand.nextInt(right - left + 1));
		int i2 = left + (rand.nextInt(right - left +1));
		int i3 = left + (rand.nextInt(right -left +1));
		
		//return their median
		
		return Math.max(Math.min(i1, i2), Math.min(Math.max(i1, i2), i3));
	}
	
	public static int partition(int arr[], int left, int right) {
		  int pivotInd = choosePivot(left, right); // Index of pivot
		  Helper.swap(arr, right, pivotInd); // self created function to swap two indices of an array
		  int pivot = arr[right]; // Pivot 
		  int i = (left - 1); // All the elements less than or equal to the
		  // pivot go before or at i

		  for (int j = left; j <= right - 1; j++) {
		   if (arr[j] <= pivot) {
		    i++; // increment the index 
		    Helper.swap(arr, i, j);
		   }
		  }
		  Helper.swap(arr, i + 1, right); // Putting the pivot back in place
		  return (i + 1);
		 }
	
	
	public static void quickSort(int[] arr, int left, int right)
	{
		
		if(left < right)
		{
			
			int pi = partition(arr, left, right);//pi is where pivot is at
			//System.out.println(pi + "hihihi");
			
			// Separately sort elements before and after partition 
			   quickSort(arr, left, pi - 1);
			   quickSort(arr, pi + 1, right);
		}
	}
	
	
	
	public static void main(String args[])
	{
		int arr[] = {5,4,1,0,5,95,4,-100,200,0};
		  int arrSize = 10;
		  quickSort(arr, 0, arrSize - 1);
		  System.out.print("Sorted array: ");
		  Helper.printArray(arr, arrSize);
		
		
		}

}
