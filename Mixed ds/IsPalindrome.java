package examples;

public class IsPalindrome {
	
	public static boolean checkPalindrome(String s)
	{
		char[] ch = s.toCharArray();
		StringBuilder res = new StringBuilder();
		
		for(char cha: ch)
		{
			if(Character.isLetterOrDigit(cha))
			{
				res.append(Character.toLowerCase(cha));
			}
		}
		
		String filteredString = res.toString();
		String reverseString = reverse(filteredString);

	
		return  filteredString.equals(reverseString);
	}
	
	public static String reverse(String s)
	{

		char[] ch = s.toCharArray();
		int left =0, right = ch.length-1;
		
		while(left < right)
		{
			char temp;
			temp = ch[left];
			ch[left++] = ch[right];
			ch[right--] = temp;
			
		}
		return new String(ch);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "my name is Palindrome";
		boolean result = checkPalindrome(s);
		System.out.println(result);
		
	}

}
