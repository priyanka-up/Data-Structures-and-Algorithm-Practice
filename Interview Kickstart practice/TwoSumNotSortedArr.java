package IK;

import java.util.Arrays;

/*if the array is already sorted then use two pointer approach 
if the array is not sorted then do presoring by libarary function in o(nlog n )  time + two pointer pass o(n)= o(nlog n)
if we allow to use auxalary space the we can use hash map that is representation(invoke an external data dtructure) change o(1)
if we dont allow to use auxalary space then do the internally presort the array which wouls take little more time but use less apce

*/

public class TwoSumNotSortedArr {
	
	public static int[] twosum(int[] arr, int target)
	{
		int i=0;
		//boolean find = false;
		int j= arr.length -1;
		int[] result = new int[2];
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		while(i<j)
		{
			if(arr[j] == target - arr[i])
			{
				result[0]= i;
				result[1]=j;
				i++;
				j--;
				//return result;
			}
			else if(arr[j] > target - arr[i])
			{
				j--;
			}
			else
			{
				i++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,3,10,41,1};
		int target =0;

		int[] a =twosum(arr,target);
		int num1 = a[0];
		int num2 = a[1];
		if(num1 + num2 == target)
		{
		   System.out.println(a[0] + "" + a[1]);
		}
		else
		{
			a[0] = -1;
			a[1] = -1;
			System.out.println(a[0] + "" + a[1]);
		}

	}

}
