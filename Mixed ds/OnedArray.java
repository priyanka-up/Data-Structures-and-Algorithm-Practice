/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

//increase nums[i] by the previous index's running sum. 
 //the previous index running sum is stored at index i-1 in the input array
  

Return the running sum of nums.

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * 
 */

package examples;

public class OnedArray {
	public static void main(String args[])
	{
		int[] arr = solution();
		for(int i=0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	private static int[] solution(){
		int[] nums = {1,2,3,4};
		for(int i=1; i<nums.length; i++)
		{
			nums[i] = nums[i] + nums[i-1];
		}
		
		return nums;
		
	}

}
