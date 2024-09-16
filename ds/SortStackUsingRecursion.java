package ds;
import java.util.*;
import java.util.Stack;

public class SortStackUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(12);
		stk.push(1);
		stk.push(14);
		
		sortStack(stk);
		printStack(stk);

	}
	public static void sortStack(Stack<Integer> s)
	{
		if(!s.isEmpty())
		{
			int x = s.pop();
			sortStack(s);
			insertSortStack(s, x);
			
		}
	}
	public static void insertSortStack(Stack<Integer> s, int x)
	{
		if(s.isEmpty() || x >s.peek())
		{
			s.push(x);
			return;
		}
		int temp = s.pop();
		insertSortStack(s,x);
		s.push(temp);
	}
	
	static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();
 
        // forwarding
        while (lt.hasNext())
            lt.next();
 
        // printing from top to bottom
        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }

}
