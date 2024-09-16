package hashing;

import java.util.HashSet;

public class CheckSubset {
	
	public static boolean findSubset(int[] arr1, int[] arr2)
	{
		HashSet<Integer> hset = new HashSet<Integer>();
		
		//hset store all the elements of arr1
		for(int i=0; i<arr1.length;i++)
		{
			if(!hset.contains(arr1[i]))
				hset.add(arr1[i]);
		}
		
		//loop to check if all elements of arr2 also lies in arr1
		for(int i=0; i<arr2.length; i++)
		{
			if(!hset.contains(arr2[i]))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2,3,7,8};
		int[] arr2 = {2,5};
		System.out.println(findSubset(arr1,arr2));
		
		

	}

}
