package test_problems_ik;
import java.util.*;
//backtracking
//optimize version

public class FindAllWellFormedBracketValidString {
	
	
		static ArrayList<String> result = new ArrayList<String>();
		
		public static ArrayList<String> generatePermutations(int n)
		{
			int open =0;
			int close =0;
			String slate = "";
			helper(n,slate,open,close);
			return result;
		}
		
		public static void helper(int n,String slate,int open, int close)
		{
			if(open > n || close >n || close >open)
			{
				return;
			}
			if(open == close && open == n && close ==n)//open == close ==n
			{
				result.add(slate);
				return;
			}
			
			//slate = slate + s.charAt(i);
			slate = slate + '(';
			helper(n,slate,open+1,close);
			slate = slate.substring(0, slate.length()-1);
			
			slate = slate + ')';
			helper(n,slate,open,close +1);
			slate = slate.substring(0, slate.length()-1);
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n= 1;//n is nothing but 2l
			System.out.println(generatePermutations(n));
			

		}

	}



