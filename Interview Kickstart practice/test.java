package IK;
import java.util.*;

public class test {
	ArrayList<String> result = new ArrayList<>();
	
	boolean is_palindrome(char[] s)
	{
		//two pointer approach
		int l=0;
		int r = s.length -1;
		while(l<r)
		{
			if(s[l++] != s[r--])
			{
				return false;
			}
		}
		return true;		
	}
	public static void helper(char[] s, int i, String slate, String last_string)
	{
		if(i == s.length)
		{
			if(is_palindrome(last_string))
			{
				result.add(slate);
			}
			return;
		}
		
		//concate
		slate = slate + s[i];
		helper(s, i+1,slate, last_string+s[i]);
		slate.remove(s.length-1);//slate.popback();
		
		if(!is_palindrome(last_string))
		{
			return;
		}
		
		//add partition char '|'
		slate = slate + '|' + last_string;
		last_string = s[i];
		helper(s, i+1,slate,last_string);
		slate.popback();
		slate.popback();
		
		
	}
	
	public static ArrayList<String>  generate_palindrome_decompositions(char[] s)
	{
		String slate = "";
		slate = slate + s[0];
		//String last_string = "";
		char[] last_string = new char[0];
		//last_string = last_string + s[0];
		//String last_string = last_string + s[0];
		helper(s, 1, slate, last_string);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "abacc";
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
		
		
		generate_palindrome_decompositions(ch);

	}

}
