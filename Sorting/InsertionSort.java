package Sorting;

public class InsertionSort {
	
	public static int[] insertionSort(int[] arr)
	{
		int n= arr.length;
		int finalindex;
		for(int i=0; i<= n-1; i++)
		{
			int temp = arr[i];
			finalindex = i;
			for(int j=i; j>=0; j--)
			{
				if(arr[j] > arr[i])
				{
					finalindex = j;
				}
			}
		    for(int k =i; k>finalindex; k--)
		    {
			    arr[k] = arr[k-1];
		    }
		    arr[finalindex] = temp;
		//return arr;
	    }
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,5,1,10,7};
		int[] result = insertionSort(arr);
		for(int i=0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}

	}

}
