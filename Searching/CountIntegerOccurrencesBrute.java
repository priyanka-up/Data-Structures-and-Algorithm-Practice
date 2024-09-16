package Searching;
//frequency of a number in a sorted array of integers.

public class CountIntegerOccurrencesBrute {
	
	public static int findOccurrence(int[] arr, int key)
	{
		int count = 0;
		
		for(int i=0; i< arr.length; i++)
		{

				if(arr[i] == key)
				{
					count++;
					//return count;
				}
			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 3, 5, 6, 7, 7,7,7,7,8,8,8};
		int key = 8;
		int result = findOccurrence(arr, key);
		System.out.println(result);

	}

}

//We simply initialize a variable, count, to keep count and set it to 0 (line 3). We then iterate over the array (line 5), increasing count by one every time the key (value to search) is encountered (lines 7-9).
