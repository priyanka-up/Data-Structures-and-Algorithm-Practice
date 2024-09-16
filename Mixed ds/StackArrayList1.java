package examples;
import java.util.ArrayList;

public class StackArrayList1<G> extends ArrayList<G> 
{
	void push(G value)
	{
		add(value);
	}
	
	G pop()
	{
		return remove(size() - 1);
	}

}
