package IK;
import java.util.*;

//Time Complexity: \mathcal{O}(n)O(n), where nn is the total length of all of the input arrays.
//Space Complexity: \mathcal{O}(1)O(1), as we only initiate three integer variables using constant space.
/*
 * From an interview perspective, we should discuss tradeoffs here.

If the length of one of the arrays is small and the other two are orders of magnitude larger, you are much better off using Binary search to find if the values in minArray exist in the other two yuuuge arrays.
if the lengths are comparable sure use your three pointer approach.
Try discussing these before rushing into simple problems. It is usually what the interviewers are looking for.
 */

public class IntersectionOfThreeArraysUsingThreePointer {
	
	public static ArrayList<Integer> usingThreePointer(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> arr3)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		//res.add(-1);
		int p1 =0;
		int p2=0;
		int p3 =0;
		
		
		while(p1 < arr1.size() && p2 < arr2.size() && p3 < arr3.size())
		{
			if(arr1.get(p1) == arr2.get(p2) && arr2.get(p2) == arr3.get(p3))
			{
				res.add(arr1.get(p1));
				p1++;
				p2++;
				p3++;
			}
			else
			{
				if(arr1.get(p1) < arr2.get(p2))
				{
					p1++;
				}
				else if(arr2.get(p2) < arr3.get(p3))
				{
					p2++;
				}
				else
				{
					p3++;
				}
			}
		}
		if(res.size() == 0)
			res.add(-1);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(1);
		arr1.add(2);
		//arr1.add(10);
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		//arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		//arr2.add(10);
		
		ArrayList<Integer> arr3 = new ArrayList<>();
		arr3.add(5);
		arr3.add(6);
		//arr3.add(10);
		
		ArrayList<Integer> result = new ArrayList<>();
		result = usingThreePointer(arr1, arr2, arr3);
		for(int i=0; i<= result.size()-1; i++)
		 {
			 System.out.println(result.get(i));
		 }

	}

}
