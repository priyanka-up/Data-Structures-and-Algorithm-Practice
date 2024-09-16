package Searching;

import java.util.Arrays;

public class DutchNationalFlagThreeWayPartitioning {
	
	public static void dutchNationalFlag(int[] arr)
	{
		int i=0;
		int j= arr.length -1;
		int mid=0;

		while(mid<=j)
		{
		//if value at mid equals to zero
			if(arr[mid] == 0)
			{
				swap(arr, i++, mid++);
			}
			//if value at mid equals to two
			else if(arr[mid] == 2)
			{
				swap(arr, mid, j--);
			}
			//if value at mid equals to one
			else if(arr[mid] ==1)
			{
				mid++;
			}
		}
	}
	
	static void swap(int[] array,int i, int j)
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {
				   2,
				   0,
				   0,
				   1,
				   2,
				   1
				  };
		dutchNationalFlag(arr);
		System.out.print(Arrays.toString(arr));
		

	}

}
