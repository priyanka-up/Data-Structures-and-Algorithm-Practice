package Searching;
//Assuming that the input array is sorted, compare the element that is being searched for with the element at the middle of the array. If the element being searched for is greater than the element at the middle of the array, recursively check for it in the second half of the given array. Otherwise, search for it in the first half of the given array.

public class BinarySearch {
	
	public static int binarySearch(int no, int[] arr, int arrSize)
	{
		
		if(arrSize <=0)
		{
			return -1;
		}
		
		//array consists of one element or none
		if(arrSize == 1)
		{
			if(no == arr[0])
				return no;
			else
				return -1;
		}
		
		int start =0;
		int end = arrSize - 1;
		int mid;
		
		while(start <= end)
		{
			mid = (start + end)/2;
			if(no < arr[mid])
				end = mid -1;
			else if(no > arr[mid])
				start = mid +1;
			else
				return mid;
			
		}
		return -1;//If the element being searched for isn’t in the array
	}
	
	public static void main(String args[])
	{
		int[] arr = {1,4,5,15,25,40,80,100};
		int arrSize = 8;
		int no =15;
		
		Helper obj = new Helper();
		obj.printArray(arr, arrSize);
		
		int index = binarySearch(no, arr, arrSize);
		if(index != -1)
		{
			System.out.println("no found" + " " + index);
		}
		else
			System.out.println("not found");
		
	}

}
