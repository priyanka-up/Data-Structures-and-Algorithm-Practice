package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Duplicates {
	
	public static ArrayList<Integer> findDuplicates(int[] arr)
	{
		ArrayList<Integer> result = new ArrayList<Integer>(arr.length);
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int count = 0;
		boolean dup = false;
		
		for(int i=0; i< arr.length; i++)
		{
			if(hmap.containsKey(arr[i]))
			{
				count = hmap.get(arr[i]);
				hmap.put(arr[i], count +1);
			}
			else
			{
				hmap.put(arr[i], 1);
			}
		}
		
		//int index =0;
		//It basically returns a set view of the map or we can create a new set and store the map elements into them
		for(Entry<Integer, Integer> entry: hmap.entrySet())
		{
			if(entry.getValue() > 1)
			{
				result.add(entry.getKey());
				dup = true;
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 3, 4, 3, 5, 4, 100, 100,100,3,3};
		ArrayList<Integer> output = findDuplicates(arr);
		System.out.println(output);

	}

}

/*
 * It uses a HashMap<Integer, Integer> to map the number against the number of times that they appear. So the entries in the hash table would look like:
 * 3     <->    2
5     <->    2
11    <->    3
 */
  
