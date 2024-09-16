/* java string toCharArray() method converts the given string into a sequence of characters.
 * 
 * 
 */

/*Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
 * 
 */



package examples;

public class ReverseStringII {
	
	public static void main(String args[])
	{
		String a =reverseStr();
		System.out.println(a);
		
	}
	
	private static String reverseStr()
	{

		String arr = "abcdefgjkl";
		int k=2;
		char[] a = arr.toCharArray();
		for (int start =0; start< a.length; start=start+2*k)
		{
			int i= start;
			int j = Math.min(start+k -1, a.length-1);
			while(i<j)
			{
				char temp = a[i];
				a[i++] = a[j];
				a[j--] = temp;
			}
		}
		return new String(a);
		
	}
}
