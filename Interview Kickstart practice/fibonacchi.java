package IK;

public class fibonacchi {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		int n1 =0;
		int n2 = 1;
		//for(int i=1; i<=n; i++)
		//{
		int i=1;
		while(i<=n)
		{
			System.out.print(n1+" ");
		    int n3=n1+n2;
		    n1 = n2;
		    n2 = n3;
		    i++;
		}
		//System.out.prinln()

		
	}

}
