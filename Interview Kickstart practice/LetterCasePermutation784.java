package IK;
import java.util.*;
/*
 * Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.
 * Return a list of all possible strings we could create. Return the output in any order.
 * Input: s = "a1b2"
   Output: ["a1b2","a1B2","A1b2","A1B2"]
   Time Complexity: O(2^{N} * N) where N is the length of S. This reflects the cost of writing the answer.
   Space Complexity: O(2^N * N)

 */

public class LetterCasePermutation784 {
	static ArrayList<String> strings = new ArrayList<>();
	
	public static ArrayList<String> letterCasePermutation784(String str)
	{
		backtrack(str, 0, new StringBuilder());
		return strings;
	}
	private static void backtrack(String str, int first, StringBuilder sb)
	{
		if(first == str.length())
		{
			 strings.add(sb.toString()); 
			 return;
		}
		char c= str.charAt(first);
		
		if(Character.isAlphabetic(c))
		{
			sb.append(Character.toUpperCase(c));//add
			backtrack(str,first+1,sb);//backtrack on remaining
			sb.deleteCharAt(sb.length()-1);//delete and back it to its old form
			
			
			sb.append(Character.toLowerCase(c));
			backtrack(str,first+1,sb);
			sb.deleteCharAt(sb.length()-1);			
		}
		else//if it is number
		{
			sb.append(c);
			backtrack(str,first+1,sb);
			sb.deleteCharAt(sb.length()-1);				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a1z";
		ArrayList<String> output = new ArrayList<>();
		output = letterCasePermutation784(str);
		//for(int out : output)
		//{
			System.out.println(output);
		//}

	}

}
