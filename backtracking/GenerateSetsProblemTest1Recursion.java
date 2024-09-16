package test_problems_ik;

import java.util.ArrayList;

public class GenerateSetsProblemTest1Recursion {
	ArrayList<Integer> result = new ArrayList<>();
	
	public static boolean generateSets(int[] arr, int k)
	{
       // ArrayList<Integer> slate = new ArrayList<>();
        int slate = 0;
		int i=0;
	    return helper(arr,i,slate);
	}
	
	public void helper(int[] arr, int i,int slate)
	{
		if(i== arr.length-1)
		{
			result.add(slate);
			return;
		}
		//exclude
		helper(arr,i+1,slate);
		slate = slate + arr[i];
		
		helper(arr, i+1,slate);//including
		slate = slate
		slate.substring(0, slate.length()-1);
	}
	
	public static void main(String[] args)
	{
		int target = 6;
		int[] arr = {2,2,8};
		boolean result =generateSets(arr,target);
		System.out.println(result);

	}

}
