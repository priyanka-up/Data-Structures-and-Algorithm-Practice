package hashing;
//Create an empty Hash Map
//Traverse given Array
//Look for second element of each pair in the hash. i.e for pair (1,2) look for key 2 in map.
//If found then store it in the result array, otherwise insert the pair in hash

//pairs must be unique for this solution to work.We are using the first element as a key when inserting into our HashMap. A duplicate key would return incorrect results. Inserting \{ 1 , 3\}{1,3} followed by inserting \{ 1 , 5\}{1,5} would cause the HashMap to return 55 when 11 is passed to the get method. We would not be able to check for the pair \{ 3 , 1\}{3,1} as it would fail the if condition of value == first

import java.util.HashMap;

public class CheckSymmetric {
	
	public static String findSymmetric(int[][] arr)
	{
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		String result = "";
		for(int i=0; i<arr.length; i++)
		{
			int first = arr[i][0];
			int second = arr[i][1];
			
			Integer value = hmap.get(second);
			if(value != null && value == first)
			{
				result = result + "{" + String.valueOf(second) + "," + String.valueOf(first) + "}";
			}
			else
				hmap.put(first, second);
		}
		return result;
	}

	public static void main(String[] args) {
		
		
		int[][] arr = {{1, 2}, {3, 4}, {5, 9}, {4, 3}, {9, 5}};
		//String result=findSymmetric(arr);
		System.out.println(findSymmetric(arr));
		

	}

}
