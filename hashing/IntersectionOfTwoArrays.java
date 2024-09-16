/*You may not need to store the data in Set for both the arrays. I stored element of nums1 (array with less number of elements) into Set and then iterate nums2. If element found, remove the element from the set, and add the current element to an Array to be returned.


 * 
 * 1. Add all elements of first array into a hashset.

2. Iterate the second array and check whether element present in hashset using contains method. If contains == true, add the element to result in array.
 */

package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {
	
	public static int[] findInterscetion(int[] arr1, int[] arr2)
	{
		//int[] result = new int[arr1.length + arr2.length];	
		
		HashSet<Integer> visited = new HashSet<>();
		List<Integer> result = new ArrayList<>();
		
		for(int i=0; i< arr1.length; i++)
		{
			visited.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length;i++)
		{
			if(visited.contains(arr2[i]))
			{
				result.add(arr2[i]);
				visited.remove(arr2[i]);
				
			}
			
		}
		
		int[] res = new int[result.size()];
		for(int i=0; i<result.size();i++)
		{
			res[i] = result.get(i);
		}
		return res;		
		
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {2,5,8};
		int[] arr2 = {0,8};
		
		int[] result = findInterscetion(arr1, arr2);
		for(int i=0; i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
		
		

	}

}
