package hashing;

public class SinglyLinkedList<T> {
    //Node inner class for SLL
    public class Node {
        public T data;
        public Node nextNode;
        public Node prevNode;
		//public SinglyLinkedList<T>.Node next;

    }

    public Node headNode; //head node of the linked list
    public int size;      //size of the linked list

    //Constructor - initializes headNode and size
    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }

    //Helper Function that checks if List is empty or not 
    public boolean isEmpty() {
        if (headNode == null) return true;
        return false;
    }
    
    public int length()
    {
    	int count =0;
    	Node currentNode = this.headNode;
    	while(currentNode != null)
    	{
    		count++;
    		//System.out.println(count);
    		currentNode = currentNode.nextNode;
    	}
		return count;
    	
    }

    //Inserts new data at the start of the linked list
    public void insertAtHead(T data) {
    	System.out.println("hello");
        //Creating a new node and assigning it the new data value
        Node newNode = new Node();
        newNode.data = data;
        //Linking head to the newNode's nextNode
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data)
    {
    	if(isEmpty())
    	{
    		System.out.println("list is empty");
    		insertAtHead(data);
    		return;
    	}
    	
    	Node newNode = new Node();
    	newNode.data = data;
    	newNode.nextNode = null;
    	
    	Node last = headNode;
    	
    	while(last.nextNode != null)
    	{
    		last =last.nextNode;
    	}
    	last.nextNode= newNode;
    	size++;
    }
    
    public void insertAfter(T data, T previous)
    {
    	Node newNode = new Node();
    	newNode.data = data;
    	 
    	Node currentNode = this.headNode;
    	
    	while(currentNode.nextNode != null && !currentNode.data.equals(previous))
    	{
    		currentNode=currentNode.nextNode;
    	}
    	
    	if(currentNode != null)
    	{
    	   newNode.nextNode=currentNode.nextNode;
    	   currentNode.nextNode = newNode;
    	   size++;
    	   
    	}
    }
    
    public boolean searchNode(T data)
    {
    	Node currentNode = this.headNode;
    	
    	while(currentNode.nextNode != null)
    	{
    		if(currentNode.data.equals(data))
    			return true;
    		currentNode = currentNode.nextNode;    		
    	}
    	return false;
    }
    
    public void deleteAtHead()
    {
    	//check list is empty
    	
    	if(isEmpty())
    	{
    		System.out.println("list is empty");
    	}
    	
    	Node currentNode=this.headNode;
    	
    	headNode = currentNode.nextNode;
    	size--;
    }
    
    public void deleteByValue(T data)
    {
    	//it can be on first position/ or not exist / or can be in between of two nodes
    	
    	//if it is not exist 
    	if(isEmpty())
    	{
    		System.out.println("list is empty");
    	}
    	
    	Node currentNode = this.headNode;
    	Node previousNode = null;
    	
    	if(currentNode.data.equals(data))
    	{
    		//currentNode.nextNode = null;
    		//size--;
    		deleteAtHead();
    		return;
    	}
    	while(currentNode.nextNode != null)
    	{
    		if(currentNode.data.equals(data))
    		{
    			previousNode.nextNode = currentNode.nextNode;
    			size--;
    			return;
    		}
    		previousNode = currentNode;
    		currentNode=currentNode.nextNode;
    		
    	}

    	
    }
    
   
    
    // Helper Function to printList
    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }
        

        Node temp = this.headNode;
        System.out.print("List : ");
        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " -> ");
            temp = temp.nextNode;
        }
        
        System.out.println(temp.data.toString() + " -> null");
    }

	public Node getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}