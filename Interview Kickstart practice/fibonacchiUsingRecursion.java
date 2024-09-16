package IK;

public class fibonacchiUsingRecursion {
	
	public static int fibonacchiRecursion(int n)
	{
		
		if(n==0)
			return 0;
		if(n==1 || n==2)
		{
			return 1;
		}
		return fibonacchiRecursion(n-2) + fibonacchiRecursion(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		for(int i=0; i<=n; i++)
		{
			System.out.println(fibonacchiRecursion(i));
		}
	

	}

}
