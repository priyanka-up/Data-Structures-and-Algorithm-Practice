package IK;
import java.util.*;
public class Merge_one_sorted_array_into_another {
	
	public static ArrayList<Integer> mergedTwo(ArrayList<Integer> list1,ArrayList<Integer> list2)
	{
		int i= list1.size()-1;
		int j= list1.size() -1;
		int k = list2.size() -1;
		
		while(i>=0 && j>=0)
		{
			if(list1.get(i) >= list2.get(j))
			{
				//list1.
				list2.set(k, list1.get(i));
				k--;
				i--;
			}
			else
			{
				list2.set(k, list2.get(j));
				k--;
				j--;
			}
		}
		while(i>=0)
		{
			list2.set(k, list1.get(i));
			k--;
			i--;
		}
		
		return list2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(3);
		list1.add(5);
		
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(0);
		list2.add(0);
		list2.add(0);
		
		ArrayList<Integer> finallist = mergedTwo(list1, list2);
		
		System.out.println(finallist);

	}

}
