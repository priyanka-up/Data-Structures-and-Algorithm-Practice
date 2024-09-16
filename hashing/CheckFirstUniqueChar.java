package hashing;

import java.util.HashMap;

public class CheckFirstUniqueChar {
	
public static int findFirstUnique(String s) {
        
        char[] ch = s.toCharArray();
     //   int left =0, right = ch.length -1;
        
       // char result =';
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0; i<ch.length; i++)
        {
            if(hmap.containsKey(ch[i]))
            {
                
				int Occurrence = hmap.get(ch[i]) +1;
                hmap.put(ch[i],Occurrence);
            }
            else
            {
                hmap.put(ch[i] , 0);
            }
        }
        
        for(int i=0; i< ch.length; i++)
        {
            if(hmap.get(ch[i]) ==0)
            {
                return i;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		String s = "lleetcode";
		int result = findFirstUnique(s);
		System.out.println(result);

	}

	

}
