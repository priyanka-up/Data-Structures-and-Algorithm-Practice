package IK;

public class factRecursion {

	public static int fact(int n)
	{
		 int fact =1;
         if(n ==0)
        	 return 1;
		 //return n * fact(n-1);
		 for(int i=1; i<=n ;i++)
		 {
			 fact = i * fact;
			 
		 }
		 return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int res=fact(n);
		System.out.println(res);

	}

}
