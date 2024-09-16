package IK;
import java.util.*;
//sorted array
/*
 * 
 * Algorithm

We would initiate a Hashmap counter to record the numbers that appear in the three arrays and the number of times they appear;
then we scan arr1, arr2, and arr3 to count the frequencies;
finally, we would iterate through counter to find the numbers that appear three times.
note that HashMap won't work here as it does not guarantee the key orders
 */

public class IntersectionOfThreeArrays {
	static HashMap<Integer, Integer> hmap;
	
	public static ArrayList<Integer> intersectionOfThree(int[] a, int[] b, int[] c)
	{
		ArrayList<Integer> ans = new ArrayList<>();
		hmap = new HashMap<>(); 
		for(int n1: a)
		{
			hmap.put(n1, hmap.getOrDefault(n1, 0) + 1);
		}
		for(int n2: b)
		{
			hmap.put(n2, hmap.getOrDefault(n2, 0) + 1);
		}
		for(int n3: c)
		{
			hmap.put(n3, hmap.getOrDefault(n3, 0) + 1);
		}
		for(int item: hmap.keySet())
		{
			if(hmap.get(item) == 3)
			{
				ans.add(item);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,5,7,9};
		int[] c = {1,3,4,5,8};
		ArrayList<Integer> res = new ArrayList<Integer>();
		res = intersectionOfThree(a,b,c);
		 for(int i=0; i<= res.size()-1; i++)
		 {
			 System.out.println(res.get(i));
		 }
		
		

	}

}
