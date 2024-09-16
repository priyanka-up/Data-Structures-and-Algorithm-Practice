package hashing;

//use hashmap to store sum as key and index i as value till sum has been calculated
//treverse the array and return true if either sum == 0 or arr[i] == 0 or hashmap already contains the sum
//else return false.


import java.util.HashMap;

public class CheckSubZero {
	
	public static boolean findSumSubsetZero(int[] arr)
	{
		HashMap<Integer,Integer> hmap = new HashMap<>();
		int sum =0;
		for(int i=0; i<arr.length; i++)
		{
			 sum = sum + arr[i];
			
			if(sum == 0 || arr[i] == 0 || hmap.get(sum) != null)
				return true;
			hmap.put(sum, i);
		}
		return false;
		
	}
	
	public static void main(String args[])
	{
		int[] arr = {6, 4, -7, 3, 12 ,9};
		System.out.println(findSumSubsetZero(arr));
	}

}
