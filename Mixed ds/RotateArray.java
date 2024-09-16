package examples;

import java.util.Arrays;

public class RotateArray {
	
	public static int[] rotateArray(int[] arr)
	{
		//right to left 
		int n = arr.length;
		int temp = arr[n-1];
		
		
		//int[] result = new int[arr.length];
		
		
	/*	for(int i=0; i<n-1; i++)
		{
			temp = arr[i+1];
			arr[i+1] = arr[i];
			System.out.println(Arrays.toString(arr));
		}
		arr[0] = arr[n -1];*/
		
		for(int i = n-1; i>0;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		return arr;
	}
	
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4};
		System.out.println(Arrays.toString(arr));
		int[] result = rotateArray(arr);
		System.out.println(Arrays.toString(result));
	}

}
