package hashing;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElement {
	
	public static int[] findFrequentEle(int[] arr, int k)
	{
		
		if (k == arr.length) {
            return arr;
        }
		
		// build hash map : character and how often it appears
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for(int n: arr)
		{
			//hmap.put(n, hmap.getOrDefault(n, 0) +1);
			hmap.put(arr[n], hmap.getOrDefault(arr[n], 0) + 1);
		}
		
		//// init heap 'the less frequent element first'
		Queue<Integer> heap = new PriorityQueue<>((n1, n2) ->hmap.get(n1) - hmap.get(n2));
		
		//keep k top frequent elements in the heap
		for (int n: hmap.keySet()) {
	          heap.add(n);
	          if (heap.size() > k) heap.poll();    
	        }
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,1,2,2,3};
		int k = 2;
		int[] result = findFrequentEle(arr, k);
		System.out.println(result.toString());
		for(int i=0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}
		
		
		

	}

}
