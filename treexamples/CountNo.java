package treexamples;

public class CountNo {
	
	/*public static void countNo(int n)
	{
		int i=0;
		if(i>=n)
		{
			return;
		}
		else
		{
			System.out.println(n + " ");
			countNo(n-1);
		}
	}
	
	
	public static void main(String args[])
	{
		countNo(5);
	}*/
	public static void countNo(int n)
	{
		
		int i=5;
		if(i <n)
			return;
		else			
		    countNo(n+1);
		    System.out.println(n + " ");
	}
		    
		public static void main(String args[])
		{
			countNo(1);
		}


}
