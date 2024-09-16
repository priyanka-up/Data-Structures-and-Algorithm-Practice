package Sorting;

public class SelectionSort {
	
	public static int[] sortedArr(int[] arr)
	{
		int n = arr.length;
		for(int i=0; i<= n-1; i++)
		{
			int minValue = arr[i];
			int miniIndex = i;
			//arr, i, arrSize - 1
			for(int red =i+1; red<= n-1; red++)
			{
				if(arr[red] < minValue)
				{
					minValue = arr[red];
					miniIndex = red;
				}
			}
			 
			 int temp = arr[i];
			 arr[i] = arr[miniIndex];
			 arr[miniIndex] = temp;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,5,4,10,7};
		int[] result =sortedArr(arr);
		for(int i=0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}

	}

}
