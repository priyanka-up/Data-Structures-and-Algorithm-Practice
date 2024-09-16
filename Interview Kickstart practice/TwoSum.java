package IK;
//presorting ->balance binary tree(o(logn)) * n
//hash table(o(1)) * n 

/*if the array is already sorted then use two pointer approach 
if the array is not sorted then do presoring by libarary function in o(nlog n )  time + two pointer pass o(n)= o(nlog n)
if we allow to use auxalary space the we can use hash map that is representation(invoke an external data dtructure) change o(1)
if we dont allow to use auxalary space then do the internally presort the array which wouls take little more time but use less apce

*/
public class TwoSum {
	
	public static int[] twosum(int[] arr, int target)
	{
		int i=0;
		//boolean find = false;
		int j= arr.length -1;
		int[] result = {-1,-1};
		while(i<j)
		{
			if(arr[j] == target - arr[i])
			{
				result[0]= i;
				result[1]=j;
				i++;
				j--;
				
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
		
		int[] arr = {1, 2, 3, 5,10};
		int target =4;
		int[] a = twosum(arr,target);
		System.out.println(a[0] + "" + a[1]);
		

	}

}
