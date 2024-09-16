package IK;
import java.util.*;

//String s = "xyz";

//2(power of n) * o(n)

public class genarateAllPossobleSubsets {
	static ArrayList<String> result = new ArrayList<>();
	
	public static void gerenate_all_subset(String s, String slate)
	{
		helper(s,0,slate);
		//return result;
	}
	
	public static void helper(String s, int i, String slate)
	{
		if(i==s.length())
		{
			result.add(slate);
			return;
		}
		helper(s, i+1,slate);//excluding
		slate = slate + s.charAt(i);
		
		helper(s, i+1,slate);//including
		slate.substring(0, slate.length()-1);
		//slate = slate 
		//slate.remove(slate.size()-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xyz";
		//StringBuilder str= new StringBuilder();
		//str.append("xyz");
		String slate = "";
		
		gerenate_all_subset(s,slate);
		for(String str1 : result)
		{
			System.out.println(str1);
		}
		

	}

}
