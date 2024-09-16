package Searching;

import java.util.ArrayList;
import java.util.Collections;

public class Duplicates {
	
	public static ArrayList<Integer> findDuplicates(int[] arr)
	{
		ArrayList<Integer> result = new ArrayList<Integer>(arr.length);
		for(int i=0; i< arr.length; i++)
		{
			for(int j=i +1; j< arr.length;j++)
			{
				if(arr[i] == arr[j] && !result.contains(arr[i]))
				{
					result.add(arr[i]);
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 3, 4, 3, 5, 4, 100, 100,100,3,3};
		ArrayList<Integer> output = findDuplicates(arr);
		System.out.println(output);

	}

}


//ArrayList <Integer> output = {3, 4, 100};
//The only difference is that if a duplicate is encountered, it checks if it is already present in the duplicates list to avoid adding it twice