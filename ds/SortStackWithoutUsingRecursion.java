package ds;
import java.util.Stack;

//sort stack using temp stack

public class SortStackWithoutUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> input = new Stack<Integer>();
		input.push(1);
		input.push(5);
		input.push(2);
		
		Stack<Integer> ss = sortStack(input);
		//printStack(ss);
		while(!ss.isEmpty())
		{
			System.out.println(ss.pop());
		}
	}
	
	public static Stack<Integer> sortStack(Stack<Integer> input)
	{
		Stack<Integer> tempS = new Stack<Integer>();
		
		while(!input.isEmpty())
		{
			int temp = input.pop();
			while(!tempS.isEmpty() && temp < tempS.peek())
			{
				int t = tempS.pop();
				input.push(t);
				
			}
			tempS.push(temp);
			
		}
		return tempS;
	}
	
	

}
