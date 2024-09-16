package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class CharOccurrences {
	
	public static boolean checkCharOccurrence(String s)
	{
		Map<Character, Integer> hmap = new HashMap<>();
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			char c = ch[i];
			if(hmap.containsKey(c))
			{
				hmap.put(c, hmap.get(c) + 1);
			}
			else
			{
				hmap.put(c,1);
			}
		}
		
		Set<Integer> set = new HashSet<Integer>();
		Iterator<Integer> itr = hmap.values().iterator();
		
		while(itr.hasNext())
		{
			int freq = itr.next();
			set.add(freq);
		}
		
		return (set.size() ==1);
		
	}
		
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abababh";
		boolean res = checkCharOccurrence(s);
		System.out.println(res);

	}

}
