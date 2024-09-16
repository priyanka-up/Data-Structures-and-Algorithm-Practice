package IK;
import java.util.*;

public class generate_palindrome_decompositions {
	static ArrayList<String> result = new ArrayList<>();
	// slate = "";
	static StringBuilder slate = new StringBuilder("");
	
	static boolean is_palindrome(String s)
	{
		//two pointer approach
		int l=0;
		int r = s.length() -1;
		while(l<r)
		{
			if(s.charAt(l++) !=  s.charAt(r--))
			{
				return false;
			}
		}
		return true;		
	}
	public static void helper(String s, int i, StringBuilder slate, String last_string)
	{
		if(i == s.length())
		{
			if(is_palindrome(last_string))
			{
				result.add(slate.toString());
			}
			return;
		}
		
		//concate
		slate = slate.append(s.charAt(i));
		helper(s, i+1,slate, last_string+s.charAt(i));
		slate.substring(0, slate.length()-1);//to remove last element from slate
		//slate.remove(s.length()-1);//slate.popback();
		
		if(!is_palindrome(last_string))
		{
			return;
		}
		
		//add partition char '|'
		slate.append('|'); 
		slate.append(s.charAt(i));
		last_string = "";
		last_string += s.charAt(i);
		helper(s, i+1,slate,last_string);
		slate.substring(0, slate.length()-1);
		slate.substring(0, slate.length()-1);
		//slate.popback();
		//slate.popback();
		
		
	}
	
	public static void  generate_decompositions(String s)
	{
		
		slate = slate.append(s.charAt(0));
		String last_string = "";
		String last_String = last_string + s.charAt(0);
		helper(s, 1,slate, last_string);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "abracadabra";
		
		generate_decompositions(s);
		for(String str: result)
		{
			System.out.println(str);
		}

	}

}
