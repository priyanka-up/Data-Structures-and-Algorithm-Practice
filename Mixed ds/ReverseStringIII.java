package examples;
//Given a string s, reverse the order of 
//characters in each word within a sentence while still preserving whitespace and initial word order.
//Input: s = "God Ding"
//Output: "doG gniD"

//we simply spill up the given string based on whitespace and put the individual words in an array of strings.
//then , we reverse each individual string and concatenate the result.we return the result after removing the 
//the additional whaitespace at the end.



/*
 * 
 *  public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
 */

public class ReverseStringIII {
	
	public static String reverseWords(String s) {
		   if(s.length() < 1)
		       return s;
		    
		    String [] str = s.split(" ");
		    String sol = "";
		    for(String eachStr : str)
		    {
		        for(int i = eachStr.length() -1; i >=0;  i--)
		        {
		            sol = sol + eachStr.charAt(i);
		        } 
		        sol = sol + " ";
		    }
		    return sol.trim();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "God Ding";
		System.out.println(reverseWords(s));
	}

}
