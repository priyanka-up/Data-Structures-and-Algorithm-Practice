package IK;
//Polish national flag problem
//lumoto particitioning
import java.util.ArrayList;

public class Segregate_ODD_EVEN {
	
	public static ArrayList<Integer> segregareOddEven(ArrayList<Integer> list)
	{
		list.add(5);
		int n =list.size();
		int white = -1;
		//int n = arr.length;
		for(int i=0; i<=n-1; i++)
		{
			if(list.get(i) % 2 ==0)
			{
				white++;
				//int temp = 0;
				int temp = list.get(white);
				list.set(white, list.get(i));
				list.set(i, temp);
				//list.get(white) = list.get(i);
				//arr[i] = temp;
			}
		}
		return(list);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr= {1,2,3,4};
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(4);
		
		ArrayList<Integer> arr = segregareOddEven(arrlist);
		//for(int i=0; i<=arr.size()-1; i++)
		//{
			System.out.println(arr);
		//}

	}

}
