package heapexample;

import java.util.Arrays;

public class Heap {
	
	private static void  maxheapify(int[] heapArr, int index, int heaplen)
	{
		int largest = index;
		while(largest < heaplen /2)
		{
			int left = (2*index) + 1;
			int right = (2*index) + 2;
			
			if(left < heaplen && heapArr[left] > heapArr[index])
				largest = left;
			if(right <heaplen && heapArr[right] > heapArr[largest])
				largest = right;
			if(largest != index)
			{
				int temp = heapArr[index];
				heapArr[index] = heapArr[largest];
				heapArr[largest] = temp;
				index = largest;
			}
			else 
				break; 
		}
	}
	
	public  void buildMaxHeap(int[] heapArr, int heaplen)
	{
		//swap largest parent to last child node
		
		for(int i =(heaplen -1)/2; i>=0; i--)
		{
			maxheapify(heapArr, i, heaplen);
		}
	}

	
	public static void main(String args[])
	{
		int[] heapArr = {1, 4, 7, 12, 15, 14, 9, 2, 3, 16};
		System.out.println("before:" + Arrays.toString(heapArr));
		new Heap().buildMaxHeap(heapArr, heapArr.length);
		System.out.println("after:" + Arrays.toString(heapArr));
	}
}
