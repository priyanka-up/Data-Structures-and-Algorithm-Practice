package Searching;
import java.util.*;
import java.util.Random;

public class Helper {
	
	static void swap(int[] array,int i, int j)
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	static void printArray(int[] arr, int arrSize)
	{
		for(int i=0; i< arrSize; i++)
		{
			System.out.println(arr[i] + " ");
			System.out.println();
		}
	}

}
