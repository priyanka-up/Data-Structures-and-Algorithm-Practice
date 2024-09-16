/*
 * i/p :Let's code
   o/p :edoc s'teL
 * 
 * 
 */

package examples;

public class ReverseWords {
	
	public static void main(String args[])
	{
		String s= "Let's code";
		char[] a = s.toCharArray();
		int left =0, right = a.length - 1;
		
		System.out.println(a);
		for(int i=0 ; i<right; i++)
		{
			char temp = a[left];
			a[left++] = a[right];
			a[right--] = temp;			
		}
		System.out.println(a);	
		
		/*for(int i=0;i<a.length;i++) 
		{
			if(Character.isWhitespace(a[i]))
			{
			
			}
			
		}*/
		
		
		
		
	}

}



/*
public class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
    }
}

*/