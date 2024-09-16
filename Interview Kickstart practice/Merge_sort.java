package IK;
import java.util.ArrayList;

//extra optimization you can talk in interview
//Auxiliary array-> define global? In main function (in the lazy manager code)
//mid= start+ (end - start)/2 ?

//o(nlogn) time
//o(n) space

public class Merge_sort {
	
	public static ArrayList<Integer> mergeSort(ArrayList<Integer> list)
	{
		int start = 0;
		int end = list.size()-1;
		helper(list, start, end);
			
		return list;
	}
	
	public static void helper(ArrayList<Integer> list, int start, int end)
	{
		System.out.println(start);
		System.out.println(end + "hi");
		//base case //leaf node
		if(start >= end)
		{
			return;
		}
		//work to be done by internal node
		int mid = start + (end- start)/2;
		helper(list ,start, mid);
		helper(list,mid+1, end);
		
		//start from left most element in both the sub arrays and merge
		int i= start,j= mid+1;
		ArrayList<Integer> auxlist = new ArrayList<Integer>();
		while(i<=mid && j<=end)
		{
			if(list.get(i) <= list.get(j))
			{
				auxlist.add(list.get(i));
				i++;
			}
			else
			{
				auxlist.add(list.get(j));
				j++;
			}
		}
		
		while(i<=mid)
		{
			auxlist.add(list.get(i));
			i++;
		}
		while(j<=end)
		{
			auxlist.add(list.get(j));
			j++;
			
		}
		//list = auxlist;
		for(int k=start,l=0; k<=end && l<=auxlist.size() -1 ; k++, l++)
		{
			//list = auxlist;
			list.set(k, auxlist.get(l));
			//System.out.println(list.get(k));
		}
		
		//return(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrList1 = new ArrayList<Integer>();
		arrList1.add(5);
		arrList1.add(8);
		arrList1.add(3);
		arrList1.add(9);
		arrList1.add(4);
		arrList1.add(1);
		arrList1.add(7);
		ArrayList<Integer> arr = mergeSort(arrList1);
		System.out.println(arr);

	}

}
