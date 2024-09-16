package examples;

public class BestTimeToBuySellStockOnePass {
	
	public static int findMaxProfit(int[] prices)
	{
		//keep track of the best day so far
		//keep track of the largest difference so far
		int largestProfit = 0;
		int minSoFar = Integer.MAX_VALUE;
		
		for(int i=0; i<prices.length; i++)
		{
			if(prices[i] < minSoFar)
			{
				minSoFar = prices[i];
			}
			else
			{
				largestProfit = Math.max(largestProfit, prices[i] - minSoFar);
			}
		}
		
		return largestProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {7,1,5,3,6,4};
		int maxProfit = findMaxProfit(prices);
		System.out.println(maxProfit);

	}

}
