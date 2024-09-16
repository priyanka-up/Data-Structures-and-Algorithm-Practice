package hashing;

import java.util.HashSet;

public class CheckDisjoint {
	
	public static boolean findDisjoint(int[] arr1, int[] arr2)
	{
		HashSet<Integer> hset = new HashSet<Integer>();
		
		for(int i=0; i<arr1.length;i++)
		{
			if(!hset.contains(arr1[i]))
				hset.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length;i++)
		{
			if(!hset.contains(arr2[i]))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {2,1,7,9};
		int[] arr2 = {3,8};
		System.out.println(findDisjoint(arr1,arr2));
	}

}
