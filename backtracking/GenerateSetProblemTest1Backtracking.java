package test_problems_ik;
/*
 * int target = 6;
		int[] arr = {2,2,8};
		need to return true or false
 */

public class GenerateSetProblemTest1Backtracking {
	
	public static boolean generateSets(int[] arr, int k)
	{
		int sum =0;
		int size = 0;
		int i=0;
	    return helper(arr,i,k,sum,size);
	}
	
	public static boolean helper(int[] arr, int i, int k,int sum,int size)
	{
		if(sum == k)
		{
			if(size >= 1)
				return true;
		}
		if(i== arr.length-1)
		{
			return false;
		}
		if(helper(arr,i+1,k,sum,size) == true)//exclude
			return true;
		return helper(arr,i+1, k,sum+arr[i],size +1);//include
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int target = 6;
		int[] arr = {2,4,8};
		boolean result =generateSets(arr,target);
		System.out.println(result);

	}

}
