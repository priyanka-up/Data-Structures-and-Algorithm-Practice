package IK;
import java.util.*;
import java.util.Map.Entry;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java";
		HashMap<Character, Integer> hmap = new HashMap<>();
		for(char ch : s.toCharArray())
		{
			if(hmap.containsKey(ch))
			{
				hmap.put(ch, hmap.get(ch) +1);
			}
			else
			{
				hmap.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = hmap.entrySet();
		for(Map.Entry<Character, Integer> entry: entrySet)
		{
			if(entry.getValue() >1)
			{
				System.out.printf("%s:%d %n",entry.getKey(),entry.getValue());
			}
		}
		

	}

}
