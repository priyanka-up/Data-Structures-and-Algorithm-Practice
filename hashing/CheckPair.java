package hashing;

import java.util.HashMap;

public class CheckPair {
	
	public static String findPair(int[] arr)
	{
		//create hashmap with a key being sum and value being pair
		//treverse all possible pairs in the given arr and store sums in map
		//if sum already exists then printout the pairs.
		
		HashMap<Integer, int[]> hmap = new HashMap<Integer,int[]>();
		String result="";
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				int sum = arr[i] + arr[j];
			
			    if(!hmap.containsKey(sum))
			    {
			    	//if sum is not present in map then insert it alongwith pair
			    	hmap.put(sum, new int[] {arr[i],arr[j]});
			    }
			    else
			    {
			    	//is sum is already there
			    	int[] prev_pair = hmap.get(sum);
			        result = result + "{" + prev_pair[0] + "," + prev_pair[1] + "}{" + arr[i] +"," + arr[j] + "}";
			        return result;
			    }
			    
		}
		
	}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 4, 7, 1, 12,9};
		System.out.println(findPair(arr));

	}

}
