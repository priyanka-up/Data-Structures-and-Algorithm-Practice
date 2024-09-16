package hashing;

import java.util.HashMap;

// A pair(i,j) is called good if nums[i] == nums[j] and i<j

/*public class CheckGoodPair {
	
	public static int findGoodPair(int[] arr)
	{
		int count =0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i] == arr[j] )
				{
					count++; 
					
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1,1,3};
		System.out.println(findGoodPair(arr));
		

	}

}*/

public class CheckGoodPair
{
	
	
	public static int findGoodPair(int[] arr)
	{
		HashMap<Integer,Integer> hmap = new HashMap<>();
		for(int i=0; i<arr.length; i++)
		{
			if(hmap.containsKey(arr[i]))
			{
				hmap.put(arr[i], hmap.get(arr[i]) +1);
			}
			else
				hmap.put(arr[i], 1);
		}
		
		int count =0;
		for(Integer i: hmap.keySet())
		{
			count = count + (hmap.get(i) * (hmap.get(i) -1))/2;
		}
		return count;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1,1,3};
		System.out.println(findGoodPair(arr));
		

	}
	
	
	
	
	
}
