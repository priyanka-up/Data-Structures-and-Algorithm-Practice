package ds;

public class BasicStack<X> {
	private X[] data;	
	private int stackPointer;
	
	
	public BasicStack()
	{
		data = (X[]) new Object[1000];	
		stackPointer = 0;
	}

	public void push( X newItem) {
		data[stackPointer++] = newItem;
	}
	
	public X pop() {
		// if there is no more elements in the stack 
		if(stackPointer == 0)
		{
			throw new IllegalStateException("no more items on the stack");
			
		}
		return data[--stackPointer];
		
		}
		
	

public boolean Contains(X item) {
	//it will return only true/false
	boolean found = false;
	for (int i=0; i< stackPointer; i++)
	{
		if(data[i].equals(item)){
			found = true;
			break;
		}
	}
	return found;	
	
}


public X access(X item) {
	
	while(stackPointer >0)
	{
		X tmpItem=pop();
		if(item.equals(tmpItem)) {
			return tmpItem;
		}
	}
	throw new IllegalArgumentException("could not find item in the stack" + item);	
	
}
public int size()
{
	return stackPointer;
}

}


