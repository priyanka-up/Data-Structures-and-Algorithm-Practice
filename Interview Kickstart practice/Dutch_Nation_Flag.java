package IK;
import java.util.ArrayList;
//three pointer
//1 <= n <= 100000
//Do this in ONE pass over the array, NOT TWO passes
//Solution is only allowed to use constant extra memory

//quick sort(rendomized pivot) is the better way to do this problem(three way partioning)

public class Dutch_Nation_Flag {
	
	public static ArrayList<Character> douchNational(ArrayList<Character> arrl)
	{
		int low = 0;
		int high = arrl.size() -1;
		int i= 0;
		
		while(i <= high)
		{
			if(arrl.get(i) == 'G')
			{
				i++;
			}
			else if(arrl.get(i) == 'B')
			{
				//char temp = '\u0000';
				char temp = arrl.get(i);
				arrl.set(i, arrl.get(high));
				arrl.set(high, temp);
				high--;				
			}
			else if(arrl.get(i) == 'R')
			{
				//char temp = '\u0000';
				char temp = arrl.get(i);
				arrl.set(i, arrl.get(low));
				arrl.set(low, temp);
				low++;
				i++;
			}
		}
		return(arrl);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> arrl = new ArrayList<Character>();
		arrl.add('G');
		/*arrl.add('B');
		arrl.add('G');
		arrl.add('G');
		arrl.add('R');
		arrl.add('B');
		arrl.add('R');
		arrl.add('G');*/
		
		System.out.println(douchNational(arrl));
		

	}

}
