package examples;
//brute force

public class MaxProductOfThreeNo {
	
	    public static int maximumProduct(int[] nums) {
	        int n = nums.length;
	        int maxProduct = Integer.MIN_VALUE;
	        
	        
	        for(int i=0; i<n-2; i++)
	        {
	            for(int j=i+1; j<n-1; j++)
	            {
	                for(int k=j+1; k<n;k++)
	                {
	                    int product = nums[i] * nums[j] * nums[k];
	                    maxProduct = Math.max(maxProduct, product);
	                }
	            }
	        }
	        return maxProduct;
	    }
	    
	    public static void main(String args[])
	    {
	    	int[] nums = {-1,-2,-3};
	    	int a =maximumProduct(nums);
	    	System.out.println(a);
	    	
	    }
	}

//on3
