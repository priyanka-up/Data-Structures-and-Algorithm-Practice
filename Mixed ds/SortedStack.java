package examples;
/*
 * 
 *  //1. Use a second tempStack.
        //2. Pop value from mainStack.
        //3. If the value is greater or equal to the top of tempStack, then push the value in tempStack
        //else pop all values from tempStack and push them in mainStack and in the end push value in tempStack and repeat from step 2.
        //till mainStack is not empty.
        //4. When mainStack will be empty, tempStack will have sorted values in descending order.
        //5. Now transfer values from tempStack to mainStack to make values sorted in ascending order.
 * 
 */

public class SortedStack {
	
	public static void sortStack(Stack<Integer> stack)
	{
		Stack<Integer> newstack = new Stack<Integer>(stack.getCapacity());
		while(!stack.isEmpty())
		{
			Integer value = stack.pop();
			if(!newstack.isEmpty() && value >= newstack.top())
			{
				newstack.push(value);
			}else
			{
				while(!newstack.isEmpty() && newstack.top() > value)
				{
					stack.push(newstack.pop());

				}
				newstack.push(value);					
			}				
		}
		while(!newstack.isEmpty())
		{
			stack.push(newstack.pop());
		}
		}
	
	public static void main(String args[])
	{
		Stack<Integer> s = new Stack<Integer>(5);
		s.push(2);
		s.push(1);
		s.push(19);
		s.push(15);
		s.push(13);
		sortStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
		
	
	}
				
	

}
