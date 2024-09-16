package hashing;
import java.util.HashSet;

public class RemoveDuplicatesinglyNode {
	
	public static <V> void removeDuplicatesWithHashing(SinglyLinkedList<V> list)
	{
		SinglyLinkedList<V>.Node current = list.getHeadNode();
		SinglyLinkedList<V>.Node previous = list.getHeadNode();
		
		//will store all the elements that we observe once
		HashSet<V> visitedNode = new HashSet<>();
		
		if(!list.isEmpty() && current.nextNode != null)
		{
			while(current != null)
			{
				//check if already visited then delete this node
				if(visitedNode.contains(current.data))
				{
					previous.nextNode = current.nextNode;
					current = current.nextNode;
				}
				else
				{
					//if node is not visited then add it to visited set
					visitedNode.add(current.data);
					
					//moving on to next element in the list 
					previous=current;
					current = current.nextNode;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		for(int i=0; i<=8; i++)
		{
			list.insertAtHead(i);
		}
		//inserting duplicates
		list.insertAtHead(2);
		list.insertAtHead(4);
		list.insertAtHead(1);
		list.printList();
		removeDuplicatesWithHashing(list);
		list.printList();

	}

}
