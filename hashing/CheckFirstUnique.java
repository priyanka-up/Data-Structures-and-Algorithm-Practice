package hashing;

//if the element does not exist in the hashmap add the element with the value =0
//else update the no of occurence of that elemnet by adding 1
//treverse the array and check the no of occurence
//return the first element with 0 occurence
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CheckFirstUnique {
	
	public static int findFirstUnique(int[] arr)
	{
		int result = 0;
		
		//HashMap<Integer,Integer> hmap = new HashMap<>();
		Map<Integer, Integer> hmap = new TreeMap<>();
		for(int i=0; i<arr.length; i++)
		{
			if(hmap.containsKey(arr[i]))
			{
				int occurence = hmap.get(arr[i]) + 1;
				hmap.put(arr[i], occurence);
			}
			else
				hmap.put(arr[i], 0);
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(hmap.get(arr[i]) == 0)
			{
				return arr[i];
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9, 2,3,2,6,6};
		int result = findFirstUnique(arr);
		System.out.println(result);

	}

}
