package Searching;

public class LinearSearch {
	
	//find 55
	public static int linearSearch(int no,int[] arr, int arrSize)
	{
		if(arrSize<=0)
		{
			return -1;
		}
		
		for(int i=0; i<arrSize; i++)
		{
			if(arr[i] == no)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		int[] arr = {5,4,1,410,5,95,4,-100,20,0};
		int arrSize = 10;
		int no =95;
		
		Helper obj = new Helper();
		obj.printArray(arr, arrSize);
		
		int index = linearSearch(no, arr, arrSize);
		if(index != -1)
		{
			System.out.println("no found" + " " + index);
		}
		else
			System.out.println("not found");
		
	}

}
