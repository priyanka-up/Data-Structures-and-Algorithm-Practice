package IK;
//two pointer approach 

public class AllZeroAndOne {
	
	public static int[] allZeroFirst(int[] arr)
	{
		int i = 0;//runningpointer
		int low = 0;//index where zero will be placed
		int n= arr.length;

		while(i <= n-1)
		{
			if(arr[i] != 0)
			{
				i++;
			}
			else
			{
				int temp =0;
				temp = arr[i];
				arr[i] = arr[low];
				arr[low] = temp;
				low++;
				i++;
			}
		}
		
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,0,1,0,1};
		int[] arr2 = allZeroFirst(arr);
		for(int i=0; i<=arr2.length-1;i++)
		{
			System.out.println(arr2[i]);
		}
		

	}

}
