//heap sort
//bucket sorting
//quick select....

/*
 * 
 * Time complexity: \mathcal{O}(N)O(N) in the average case, \mathcal{O}(N^2)O(N 
2
 ) in the worst case. Please refer to this card for the good detailed explanation of Master Theorem. Master Theorem helps to get an average complexity by writing the algorithm cost as T(N) = a T(N / b) + f(N)T(N)=aT(N/b)+f(N). Here we have an example of Master Theorem case III: T(N) = T \left(\frac{N}{2}\right) + NT(N)=T( 
2
N
​
 )+N, that results in \mathcal{O}(N)O(N) time complexity. That's the case of random pivots.

In the worst-case of constantly bad chosen pivots, the problem is not divided by half at each step, it becomes just one element less, that leads to \mathcal{O}(N^2)O(N 
2
 ) time complexity. It happens, for example, if at each step you choose the pivot not randomly, but take the rightmost element. For the random pivot choice the probability of having such a worst-case is negligibly small.

Space complexity: up to \mathcal{O}(N)O(N) to store hash map and array of unique elements.
 */


package IK;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class TopKthFrequent {
	static int[] unique;
    static Map<Integer, Integer> count;
	
	public static ArrayList<Integer> quickSelect(ArrayList<Integer> numbers, int k)
	{
		ArrayList<Integer> finall = new ArrayList<Integer>();
		// build hash map : character and how often it appears
        count = new HashMap();
        for (int num: numbers) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        // array of unique elements
        int n = count.size();
        unique = new int[n]; 
        int i = 0;
        for (int num: count.keySet()) {
            unique[i] = num;
           
            i++;
        }
        
     // kth top frequent element is (n - k)th less frequent.
        // Do a partial sort: from less frequent to the most frequent, till
        // (n - k)th less frequent element takes its place (n - k) in a sorted array. 
        // All element on the left are less frequent.
        // All the elements on the right are more frequent. 
        helper(0, n - 1, n-k);
        // Return top k frequent elements
        for(int j= n-k; j<=n-1; j++)
        {
        	finall.add(unique[j]);
        }
        
        //return Arrays.copyOfRange(unique, n - k, n);
        return finall;
    
		//int start =0;
		//helper(numbers, start, numbers.size() -1,k-1);//numbers.size() -k);//sub ordinate
		//return numbers.get(numbers.size() - k);
		//return numbers.get(k-1);
	}
	
	public static void swap(int a, int b) {
        int tmp = unique[a];// unique[a];
        unique[a] = unique[b];
        unique[b] = tmp;
       // unique.set(a, b);
       // unique.set(b,tmp);

    }
	
    public  static int partition(int start, int end, int pivot_index) {
        int pivot_frequency = count.get(unique[pivot_index]);
        // 1. move pivot to end
        swap(pivot_index, end);
        int store_index = start;

        // 2. move all less frequent elements to the left
        for (int i = start; i <= end; i++) {
            if (count.get(unique[i]) < pivot_frequency) {
                swap(store_index, i);
                store_index++;
            }
        }

        // 3. move pivot to its final place
        swap(store_index, end);

        return store_index;
        
        
        
        
    }
	
	public static void helper(int start, int end, int nMinusK)//index =kth smallest
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
		
		pivot = partition(start, end, pivot);
		
		 // if the pivot is in its final sorted position
        if (pivot == nMinusK) {
            return;    
        } else if (pivot > nMinusK) {
            // go left
            helper(start, pivot - 1, nMinusK);     
        } else {
            // go right 
            helper(pivot + 1, end, nMinusK);  
        }
		
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // build hash map : character and how often it appears
       
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add(3);
		arr.add(5);
		arr.add(5);
		int k=2; //most frequent element
		
		//ArrayList<Integer> index  = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		result=quickSelect(arr, k);
		for(int i=0; i<= result.size()-1; i++)
		{
		    System.out.println(result.get(i));

	    }
	}
	
	

}
