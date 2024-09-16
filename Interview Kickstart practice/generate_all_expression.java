package IK;
import java.util.*;

public class generate_all_expression {
	
	static ArrayList<String> result = new ArrayList<String>();
	
	public static ArrayList<String> generate_all_expression(StringBuilder s, long target)
	{
		String slate = "";
		slate = slate + s.charAt(0);
		long sum =0;
		long product =1;
		long char_num = s.charAt(0);//ch to int value
		int i=1;
		helper(s,1,slate,0,1,char_num,target);
		return result;
	}
	
	public static void helper(StringBuilder s, int i, ArrayList<Character> slate, long sum,long product, long curr_num,long target)
	{
		//base case
		if(i==s.length())
		{
			if((sum + product * curr_num)== target)
			{
				result.addAll(new ArrayList<String>(slate));
				//output.add(new ArrayList<Character>(nums));
			}
			return;
		}
		//concate(join :)
		slate = slate + s.charAt(i);
		//slate.add(ch[i]);
		helper(s, i+1, slate,  sum, product, (curr_num * 10 + s.charAt(i)), target);
		slate.remove(s.length()-1);
		
		//use +
		slate = slate + '+' + s.charAt(i);
		helper(s, i+1, slate,  sum + curr_num * product, 1, s.charAt(i), target);
		slate.remove(s.length()-1);
		slate.remove(s.length()-1);
		
		//use *
		slate = slate + '*' + s.charAt(i);
		helper(s, i+1, slate,  sum, curr_num * product, s.charAt(i), target);
		slate.remove(s.length()-1);
		slate.remove(s.length()-1);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s= new StringBuilder();
		s.append("202");
		long target = 4;
		/*char[] ch = new char[0];
		for(int i=0; i<= s.length()-1; i++)
		{
			 ch[i] = s.charAt(i);
		}*/
		generate_all_expression(s, target);
		

	}

}
