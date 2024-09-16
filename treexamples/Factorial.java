package treexamples;

public class Factorial {
	
	public static int fact(int n)
	{
		//int fact=0;
		if(n==1)
			return n;
		else
			n = n * fact(n-1);
		return n;
	}
	
	public static int factIterative(int n)
	{
		int fact =1;

		for(int i=1; i<=n; i++)
		{
			fact = fact * i;			
			
		}
		return fact;
		
	}
	
	public static void main(String args[])
	{
		//int result = fact(5);
		//System.out.println(result);
		
		int resultIterative = factIterative(5);
		System.out.println(resultIterative);
		
	}

}
