package IK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArrayListHash {
	
	private static ArrayList<Integer> onepass(ArrayList<Integer> list, int target)
	{
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(-1);
		result.add(-1);
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int i= 0; i<= list.size() -1; i++)
		{
			int complement = target - list.get(i);
			if(mp.containsKey(complement))
			{
				//return result {,i};
				result.set(0, mp.get(complement));
				result.set(1, i);
				return result;
			}
			mp.put(list.get(i), i);
		}
		return result;
		//throw new IllegalArgumentException("not found");
		//return nums;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(1);
		arrlist.add(3);
		arrlist.add(2);
		arrlist.add(5);
		arrlist.add(10);
		
		int target = 8;
		
		ArrayList<Integer> arr = onepass(arrlist, target);
		//for(int i=0; i<=arr.size()-1; i++)
		//{
			System.out.println(arr);
		//}

	}

}
