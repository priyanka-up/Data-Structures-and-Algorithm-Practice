package IK;
import java.util.HashMap;
//in brute force we have o(nlogn) time so by heap we can reduce our time compl.
//using heap(min heap) o(nlogk)
//we also have other better approch bucket sorting o(n)
//sort in based of frequency

public static int[] topKFrequent(int[] nums, int k)
{
	
	if(k== nums.length)//if k ==n we can return the nums itself
		return nums;
	
	Map<Integer, Integer> count = new HashMap<Integer, Integer>();
	for(int num : nums)
	{
		count.put(num, count.getOrDefault(num,0) + 1);
		
	}
	
	//now create min heap->will use a priority queue for the implementation
	//we also specify the comparing of two numbers n1 and n2 will get the frequency of hashmap and compairing the frequency
	//not the node levels
	
	Queue<Integer> heap = new PriorityQueue<>(
			(n1, n2) ->count.get(n1) - count.get(n1));
	
/*	we iterate over the key on hashmap inserting each key in the heap
	at some point the size of the heap may become larger than k 
	at that point to maintain the size of the heap or every number we add in the heap we also want to poll from the heap
	to remove the least frequent no.
	ans since we restrict the size of the heap to be the atmost k
	at the end of the iteration k elemnt will be remaining  */
	
	for(int num : count.keySet())
	{
		heap.add(n);
		if(heap.size() > k)
			heap.poll();
	}
	
	//we create a new interger array to store those element as we poll the k elemnt from the heap
	//finally we return the top k element
	
	int[] top = new int[k];
	for(int i= k-1; i>=0; i--)
	{
		top[i]=heap.poll();
	}
	return top;
	
}

public class TopKFrequestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}}

time and space comp:
	to iterate over the nums array takes order of o(n) time where n is the no of element
	for each of the n keys of the hashmap we insert them into the priority queue which takes o(logk) time each
	since the size of priority queue restricted to the size of k where k is the input provided to us.
	this means total time is o (nlogk) for the size of priority queue
	finally we extract all the k element from the priority queue and store them in an array which is return so o(klogk)
			
	so the overall complexity is o(nlogk) and space o(n)


