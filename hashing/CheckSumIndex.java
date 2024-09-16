package hashing;

import java.util.Arrays;
import java.util.HashMap;

public class CheckSumIndex {
	
	public static int[] findIndex(int[] arr, int n)
	{
		HashMap<Integer, Integer> hmap = new HashMap<>();
		//int[] result = new int[2];
		
		for(int i =0; i<arr.length;i++)
		{
			int complement = n - arr[i];
			//  System.out.println(complement);
			if(hmap.containsKey(complement))
			{
				return new int[] {hmap.get(complement), i};
			}
			hmap.put(arr[i],i);
		}
		throw new IllegalArgumentException("not found");
		
	}
	
	
	public static void main(String args[])
	{
		int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
		int n = 27;
		int[] arr1 = findIndex(arr, n);
	//	System.out.println(Arrays.toString(arr1));
		for(int i=0;i< arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
	}

}
