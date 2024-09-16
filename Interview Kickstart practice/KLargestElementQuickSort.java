package IK;

import java.util.Random;

public class KLargestElementQuickSort {
	
	/* static void random(int arr[],int low,int high)
	    {
	     
	        Random rand= new Random();
	        int pivot = rand.nextInt(high-low)+low;
	         
	        int temp1=arr[pivot]; 
	        arr[pivot]=arr[high];
	        arr[high]=temp1;
	    }*/
	
	public static int quickSelect(int[] arr, int k)
	{
		int start =0;
		helper(arr, start, arr.length -1,arr.length -k);//sub ordinate
		return arr[arr.length - k];
		//return arr[k-1];
	}
	
	public static void helper(int[] arr, int start, int end, int index)
	{
		//base case
		if(start == end)
		{
			return;
		}
		//recursive case: internal node worker
		//random(arr,low,high);
        //int pivot = arr[high];
		Random rand= new Random();
		int pivot = rand.nextInt(end-start)+start;		
		int temp = arr[pivot];
		arr[pivot] = arr[start];
		arr[start] = temp;
		
		//lumoto's partitioning
		int orange = start;
		for(int green = start + 1; green<= end; green++)
		{
			if(arr[green] <= arr[start])
			{
				orange++;
				int temp2 = arr[green];
				arr[green] = arr[orange];
				arr[orange] = temp2;
			}
		}
		int temp3 = arr[start];
		arr[start] = arr[orange];
		arr[orange] = temp3;
		
		//find n-k value in half
		if(orange == index) //lucky case
		{
			return;
		}
		else if(index < orange)
		{
			helper(arr,start,orange -1, index);
		}
		else //(index > orange)
		{
			helper(arr, orange+1, end, index);
		}
		
		
		//return arr.length -k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {5,1,10,3,2};
		int k=2; //second largest element
		int index = quickSelect(arr, k);
		System.out.println(index);

	}

}
