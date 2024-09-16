package IK;
//k-1(smallest element)
//n-k(largest element)

//average case o(n)
//worst case o(n2)

import java.util.ArrayList;
import java.util.Random;

public class KLargestElementQuickSelectArrayList {
	
	public static int quickSelect(ArrayList<Integer> numbers, int k)
	{
		int start =0;
		helper(numbers, start, numbers.size() -1,k-1);//numbers.size() -k);//sub ordinate
		//return numbers.get(numbers.size() - k);
		return numbers.get(k-1);
	}
	
	
	
	public static void helper(ArrayList<Integer> arr, int start, int end, int index)
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
		/*int temp = arr[pivot];
		arr[pivot] = arr[start];
		arr[start] = temp;*/
		
		int temp = arr.get(pivot);
		arr.set(pivot, arr.get(start));
		arr.set(start, temp);
		
		//lumoto's partitioning
		int orange = start;
		for(int green = start + 1; green<= end; green++)
		{
			if(arr.get(green) <= arr.get(start))
			{
				orange++;

				
				int temp2 = arr.get(green);
				arr.set(green, arr.get(orange));
				arr.set(orange, temp2);
			}
		}

		
		int temp3 = arr.get(start);
		arr.set(start, arr.get(orange));
		arr.set(orange, temp3);
		
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
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int k=2; //second largest element
		int index = quickSelect(arr, k);
		System.out.println(index);

	}

}
