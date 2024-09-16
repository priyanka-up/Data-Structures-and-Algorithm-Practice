/*Merge Two Sorted Arrays
 * 
 * we start by creating a new empty array of the size equal to the sum of sizes of input arrays. Starting off from the index 0 individually compare the elements at corresponding indexes of both arrays. Place the element with smaller value in the resultant array, and increment the index of the array where you find the smallest element. Keep repeating this till you hit the end of one array. Move the elements of the other array into the resultantArray as it is.
 */
/*
 * The time complexity for this algorithm is O(n+m), where n and m are the sizes of arr1 and arr2, respectively. This is because both arrays are iterated over once.
 */


package examples;

public class CheckMergeArray {
	
	public static int[] mergeArray(int[] arr1, int[] arr2)
	{
		int i =0, j=0,k=0;
		int s1 = arr1.length;
		int s2 = arr2.length;
		int[] resultArray = new int[s1 + s2];
		
		while(i< s1 && j< s2)
		{
			if(arr1[i] < arr2[j])
				resultArray[k++] = arr1[i++];
			else
				resultArray[k++] = arr2[j++];
		}
		//for remaining element of the first array
		
		while(i<s1)
		{
			resultArray[k++] = arr1[i++];
		}
		
		while(j< s2)
		{
			resultArray[k++] = arr2[j++];
		}
		return resultArray;
		
	}
		

	public static void main(String args[])
	{
		int[] arr1 = {1, 12,13,15,16};
		int[] arr2 = {2,3,4,5};
		int[] finalArr = mergeArray(arr1, arr2);
		
		System.out.println("array after mergeing:");
		
		for(int i=0; i<arr1.length + arr2.length; i++)
		{
			System.out.println("" + finalArr[i]);
		}
	}

}
