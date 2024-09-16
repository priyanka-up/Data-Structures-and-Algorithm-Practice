package ds;
//queue perform constant item

public class BasicQueue<X> {
	private X[] data;
	private int front;
	private int end;
	
public BasicQueue()
{
	this(1000);
}

public BasicQueue(int size)
{
	this.front = -1;
	this.end = -1;
	data = (X[]) new Object[size];
	
}
public int size()
{
	//if queue is empty then return 0
	
	if(this.front == -1 && this.end == -1)
	{
		return 0;
	}
	else
	{
		return end - front + 1;
	}
}
//insert item
public void enQueue(X item)
{
	//first see if the queue is full
	//System.out.println(size());
	//System.out.println((end -1) % data.length);
	if((end +1) % data.length == front)
	{
		throw new IllegalStateException("the queue is full");
	}
	//otherwise check to see if any items have been added to the queue first
	
	else if(size() == 0)
	{
		front++;
		end++;
		data[end]= item;
	}
	else
	{
		end++;
		data[end] = item;
	}
	
}
//delete item
public X deQueue()
{    X temp = null;
	//if there is no item in queue then size() method will return 0
	if(size() == 0)
	{
		throw new IllegalStateException("can not remove element of the queue");
	}
	//if there is only one element in the queue
	else if(front == end)
	{
		
		temp= data[front];
		data[front] = null;
		front = -1;
		end = -1;	
		System.out.println(temp + "hi");
	}
	//if there are multiple elements in the queue
	else
	{
		temp = data[front];
		data[front] = null;
		front++;
	}
	
	return temp;
	
}
//check if item is present in the queue or not
public boolean Contains(X item)
{
	System.out.println("hi");
	boolean found = false;
	if (size() == 0)
		return found;
    for(int i = front; i < end ;i++)
        {
    	if(data[i].equals(item))
    	    {
    		found = true;
    		}
    	}
     return found;
}

//Access particular data from queue
//1)if queue is empty then we could not get the data
//2)if given position > the size() of the queue
// so again the access method is big o linear performance bez we loop through the queue have to go though all the items inthe queue before we return
//what we are looking for

public X access(int position) {

//first check queue is not empty and given queue size is not < then the position
	if(size() == 0 ||  position > size())
	{
		throw new IllegalStateException("queue is empty or position is greater then the mentioned size");
	}
	//front of the queue is not always gone be zero bez that pointer moves up and down of the queue for the 
	//performance reason
	int trueIndex = 0;
	for (int i= front; i<end;i++)
	{
		if(trueIndex == position) {
			return data[i];
		}
		trueIndex++;
	}
		
		//if we did not find the item throw the exception
		throw new IllegalArgumentException("could not get queue item in the position");
	}
	
	
}



