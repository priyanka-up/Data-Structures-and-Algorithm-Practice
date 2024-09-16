package Searching;

public class CountIntegerOccurrenceBinarySearch {
	
	public static int binarySearch(int key, int[] arr, int arrSize)
	{
		if(arrSize <= 0)
		{
			return  -1;
		}
		
		if(arrSize == 1)
		{
			if(key == arr[0])
				return key;
			else
				return -1;
		}
		
		int start =0;
		int end = arr.length -1;
		int mid;
		
		while(start <= end)
		{
			mid = (start + end)/2;
			if(key < arr[mid])
				end = mid -1;
			else if(key > arr[mid])
				start = mid +1;
			else
				return mid;
		}
		return -1;
	}
	
	public static int findOccurrence(int[] arr, int key)
	{
		int arrSize = arr.length;
		
		//to find out the starting index
		int index = binarySearch(key, arr, arrSize);//10
		
		if(index == -1)
			return 0;//element is not present
		
		int count =1;
		
		//counting the once present on the left
		int start = index -1;
		while(start >=0 && arr[start] == key)
		{
			count++;
			start--;
		}
		
		//counting the once present on the right
		int end = index+1;
		while(end < arrSize && arr[end] == key)
		{
			count++;
			end++;
		}
		
		return count;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 3, 5, 6, 7, 7,7,7,7,8,8,8};
		int key = 7;
		int result = findOccurrence(arr, key);
		System.out.println(result);

	}

}

//It draws upon the fact that if an element exists in a sorted array, all of its occurrences exist contiguously. It simply uses a binary search to find one such occurrence and counts the ones that are present on its left and right (
//The time complexity of the binary search algorithm used in this function is O(logn)O(logn) and the time required to count the adjacent duplicates is O(count)O(count), which makes it O(logn + count). However, the time complexity is still O(n) in the worst case
