package test_problems_ik;
//brute force
//check how many 2)valid paranthesis now 1)generate all the possible permutations

public class validParaenthesisBrute {
	
	public static boolean validParan(String s)
	{
		int open = 0;
		int close =0;
		for(int i=0; i<= s.length()-1;i++)
		{
			if(s.charAt(i) == '(')
			{
				open++;
			}
			else
			{
				close++;
			}
			if(close>open)
			{
				return false;
			}
		}
		return(open == close);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "((()()))";
		boolean result = validParan(s);
		System.out.println(result);

	}

}
