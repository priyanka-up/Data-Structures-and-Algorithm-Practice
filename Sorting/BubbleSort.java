package Sorting;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] arr)
	{
		int n = arr.length;
		int temp;
		for(int i=0; i<= n-1; i++)
		{
			for(int red = n-1; red>= i+1; red--)
			{
				if(arr[red-1] >arr[red])
				{
					temp = arr[red -1];
					arr[red-1] = arr[red];
					arr[red] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,5,4,10,7};
		int[] result = bubbleSort(arr);
		for(int i=0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}
	}

}
