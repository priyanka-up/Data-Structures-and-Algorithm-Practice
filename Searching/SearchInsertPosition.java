package Searching;
//to find the appropriate position to insert a new element in a sorted array or already inserted element index.

public class SearchInsertPosition {
	
	public static int findKeyIndex(int[] arr, int key)
	{
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i] == key)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int insertPosition(int[] arr, int key)
	{
		int arrSize = arr.length -1;
		
		if(arrSize <1)
		{
			return -1;
		}
		int start =0;
		int end = arrSize -1;
		int mid =0;
		int pos =0;
		
		while(start <= end)
		{
			mid = start + (end-start)/2;
			
			if(arr[mid] == key)
			{
				return mid;
			}
			else if(arr[mid] > key)
			{
				end = mid -1;
				pos = mid;
				
			}
			else if(arr[mid] < key)
			{
				start = mid+1;
				pos = mid +1;
			}
			
		}
		
		return pos;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,6,8,9};

		
		System.out.println("Index to Insert " + "\"7\" is " + insertPosition(arr, 7));

	}

}
