package examples;

public class MaximumProductOfTwoElements {
	
	
	
	public static int findMaxProduct(int[] nums)
	{
		int maxPro = Integer.MIN_VALUE;
		for(int i=0; i< nums.length; i++)
		{
			for(int j=i+1; j< nums.length;j++)
			{
				if((nums[i]-1)*(nums[j]-1) > maxPro)
					maxPro = (nums[i]-1)*(nums[j]-1);
			}
		}
		return maxPro;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,2};
		int product = findMaxProduct(arr);
		System.out.println(product);

	}

}
