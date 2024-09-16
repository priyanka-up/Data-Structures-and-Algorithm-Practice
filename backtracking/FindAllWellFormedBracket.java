package test_problems_ik;
import java.util.*;
//given a positive integer n, return all strings of length 2*n with well formed round brackets
//n=2;
//l=2n;
//brute force	//2(power2n) * 2n
//1)generate all the possible permutations 2)check for valid paranthesis but what we get in output is not valid stings.

public class FindAllWellFormedBracket {
	static ArrayList<String> result = new ArrayList<String>();
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
	
	public static ArrayList<String> generatePermutations(int n)
	{
		int i=0;
		String slate = "";
		int l= 2*n;
		helper(2*n,slate,i);
		return result;
	}
	
	public static void helper(int n,String slate,int i)
	{
		if(i==n)
		{
			if(validParan(slate))
			{
			result.add(slate);
			}
			return;
		}
		
		//slate = slate + s.charAt(i);
		slate = slate + '(';
		helper(n,slate,i+1);
		slate.substring(0, slate.length()-1);
		
		slate = slate + ')';
		helper(n,slate,i+1);
		slate.substring(0, slate.length()-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 3;//n is nothing but 2l
		System.out.println(generatePermutations(n));
		

	}

}
