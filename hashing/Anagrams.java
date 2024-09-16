package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
	
	public static String groupAnagrams(String arr[])
	{
		HashMap<String, List<String>> hmap = new HashMap<>();
		
		for(int i=0;i<arr.length; i++)//traverse all the words
		{
			String word = arr[i];
			char[] letters = word.toCharArray();//convert the given string arrays each index value to char array
			Arrays.sort(letters);//now sort all the words
			String newWord = new String(letters);//and then re-convert each word to seperate string 
			
			//calculate hashCode after string sorting
			
			if(hmap.containsKey(newWord))
			{
				hmap.get(newWord).add(word);
			}
			else
			{
				List<String> totalWords = new ArrayList<>();
				totalWords.add(word);//add words for the specific hashcode
				hmap.put(newWord, totalWords);
			}
			
		}
		
		//print values if size > 1 , if u want to print non anagrams, then print the value with size =1 
		String anagrams = "";
		for(String s: hmap.keySet())
		{
			List<String> values = hmap.get(s);
			if(values.size() > 1)
			{
				anagrams = anagrams + values;
			}
		}
		
		return anagrams;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {
				   "cat",
				   "dog",
				   "tac",
				   "god",
				   "act",
				   "tom marvolo riddle ",
				   "abc",
				   "def",
				   "cab",
				   "fed",
				   "clint eastwood ",
				   "i am lord voldemort",
				   "elvis",
				   "old west action",
				   "lives"
				  };
		
		System.out.println(groupAnagrams(arr));

	}

}


/*
 * First, this solution makes a 
 * copy of the array and sorts each string in the copy using the built-in sort() function of arrays. Then, it saves the sorted array into a HashMap called map. The key, in this case, is the sorted string, and the value is a vector of the indices of where it exists in the array. So, the hash table would have entries that look like:
 * abc <-> {1, 3}
 * 
 * Sorting one word takes O(klogk)O(klogk) time in the average case using quickSort (where kk is the length of the longest word in the given array), so sorting nn words would take O(n\times klogk)O(n×klogk). The rest of the operations use hashing, which is all in constant time and, therefore, doesn’t count.
 */
 
