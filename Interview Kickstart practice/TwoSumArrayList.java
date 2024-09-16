package IK;
import java.util.*;

public class TwoSumArrayList {
	
	public static ArrayList<Integer> pair_sum_sorted_array(ArrayList<Integer> numbers, int target) {
        // Write your code here.
        int i=0;
        int j= numbers.size() - 1;
       // int[] result = {-1, -1};
        ArrayList<Integer> result1 = new ArrayList<Integer>(2);
        result1.add(-1);
        result1.add(-1);
        while(i<j)
        {
            if(numbers.get(j) == target - numbers.get(i))
            {
                result1.set(0, i);
                result1.set(1, j);
                i++;
                j--;
            }
            else if (numbers.get(j) > target - numbers.get(i))
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        
        return(result1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(5);
		arrlist.add(10);
		
		int target = 18;
		
		ArrayList<Integer> arr = pair_sum_sorted_array(arrlist, target);
		//for(int i=0; i<=arr.size()-1; i++)
		//{
			System.out.println(arr);
		//}

	}

	}


