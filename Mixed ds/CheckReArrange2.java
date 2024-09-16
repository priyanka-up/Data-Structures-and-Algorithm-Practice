package examples;

import java.util.Arrays;

//Re-arranging in Place 

public class CheckReArrange2 {
	
	public static void checkSum2(int[] arr)
	{
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < 0)
			{
				if(i != j)
				{
					int temp =arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				j++;
			}
		}
	}
	
	
	public static void main(String args[])
	{
		int[] arr = {-1,8,-2, 9,-7};
		checkSum2(arr);
		System.out.println(Arrays.toString(arr));
	}

}
