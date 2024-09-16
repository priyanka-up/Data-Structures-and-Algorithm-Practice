package ds;

public class BasicLinkedList <G>
{
	private Node first;
	private Node last;
	private int nodecount;
	
	public BasicLinkedList() {
	first = null;
	last = null;
	nodecount = 0;
	}
	
	public int size() {
		return nodecount;
	}
	
	public void add(G item)
	{
		//first check list is empty or there is no item
		
		if(first == null)
		{
			first=new Node(item);
			last = first;
		}
		// if some nodes are already there
		else
		{
			//just created a item of type node 
			Node newLastNode=new Node(item);
			last.setNextNode(newLastNode);//(variable.med name)
			last = newLastNode;
		}
		nodecount++;
	}
	
	public G remove() {
		//check if list is empty
		
		if(first == null)
		{
			throw new IllegalStateException("there are no item in the current list");
		}
		//if there is some item 
		else
		{
			G nodeItem = first.getNodeItem();
			
			//now update the first pointer and throw away the old first
			first = first.getNextNode();
			nodecount--;
			return nodeItem;
		}
	}
	
	
	
	
	/*public void insert (G item, int position)//position at 3 and size() = 2
	{
		if(size() < position)
		{
			throw new IllegalStateException("list is smaller than the position where we need to add a new node");
		}
		Node currentNode=first;
		
		//create a loop to reach the position and i=1 bez we have already on first node
		for(int i=1; i< position && currentNode != null; i++)
		{
			currentNode =currentNode.getNextNode();
		}
		
		//after reaching the position will create a new node and link to nextnode
		
		Node newnode = new Node(item);
		Node nextnode = currentNode.getNextNode();
		currentNode.setNextNode(newnode);
		newnode.setNextNode(nextnode);
		nodecount++;
		
	}*/
	
	public void add(int position, G item)//ArrayList
	{
		if(size() < position)
		{
			throw new IllegalStateException("list is smaller than the position where we need to add a new node");
		}
		Node currentNode=first;
		
		//create a loop to reach the position and i=1 bez we have already on first node
		for(int i=1; i< position && currentNode != null; i++)
		{
			currentNode =currentNode.getNextNode();
		}
		
		//after reaching the position will create a new node and link to nextnode
		
		Node newnode = new Node(item);
		Node nextnode = currentNode.getNextNode();
		currentNode.setNextNode(newnode);
		newnode.setNextNode(nextnode);
		nodecount++;
		
	}
	
	
	
	/*public G removeAt(int position) {
		
		//check if list is empty
		if(first == null)
		{
			throw new IllegalStateException("Linked list is empty");
		}
		Node currentNode = first;
		Node prevNode = first;
		
		for (int i=1; i<position && currentNode != null; i++)
		{
			prevNode= currentNode;
			currentNode=currentNode.getNextNode();
		}
		
		G nodeItem = currentNode.getNodeItem();
		prevNode.setNextNode(currentNode.getNextNode());
		nodecount --;
		return nodeItem;
		
	}*/
	
	public G remove(int position) {
		
		//check if list is empty
		if(first == null)
		{
			throw new IllegalStateException("Linked list is empty");
		}
		Node currentNode = first;
		Node prevNode = first;
		
		for (int i=1; i<position && currentNode != null; i++)
		{
			prevNode= currentNode;
			currentNode=currentNode.getNextNode();
		}
		
		G nodeItem = currentNode.getNodeItem();
		prevNode.setNextNode(currentNode.getNextNode());
		nodecount --;
		return nodeItem;
		
	}
	
	public G get(int position)
	{
		//make sure list is not empty
		if(first == null)
		{
			throw new IllegalStateException("Linked list is empty and there is no item to return");
		}
		
		Node currentNode=first;
		for (int i=1; i<position && currentNode != null; i++)
		{
			//simply reach to that position and return that item
			
			if(i == position)
			{
				return currentNode.getNodeItem();
			}
			currentNode =currentNode.getNextNode();
			
		}
		//if we did not find it then return null
		return null;
		
	}
	
	/*public int find(G item) 
	{
		
		if (first == null)
		{
			throw new IllegalStateException("Linked list is empty");
		}
		Node currentNode=first;
		
		for(int i=1; i<size() && currentNode != null; i++)
		{
			if(currentNode.getNodeItem().equals(item))
			{
				return i;
			}
			currentNode=currentNode.getNextNode();
		}
		
		return -1;
		
	}*/
	
	public int indexOf(G item)//ArrayList
	{
		if (first == null)
		{
			throw new IllegalStateException("Linked list is empty");
		}
		Node currentNode=first;
		
		for(int i=1; i<size() && currentNode != null; i++)
		{
			if(currentNode.getNodeItem().equals(item))
			{
				return i;
			}
			currentNode=currentNode.getNextNode();
		}
		
		return -1;
	}
	
	
	//useful for pretty print	
	public String toString()
	{
		StringBuffer Contents = new StringBuffer();
		Node curNode = first;
		while(curNode != null)
		{
			Contents.append(curNode.getNodeItem());
			curNode=curNode.getNextNode();
			
			if(curNode != null)
			{
				Contents.append(",");
			}
		}
		return Contents.toString();
		
	}
	

private class Node{
	private Node nextnode;
	private G nodeItem;
	
	public Node(G item) {
		this.nextnode = null;
		this.nodeItem = item; 
		
	}
	
	public void setNextNode(Node nextnode) {
		this.nextnode = nextnode;
		
	}
	
	public Node getNextNode() {
		return nextnode;
		
	}
	
	public G getNodeItem() {
		return nodeItem;
		
	}
}



}
