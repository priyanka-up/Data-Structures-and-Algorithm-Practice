package examples;

public class PalindromeChallenge {
	
	public static void main(String args[])
	{
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		/*for(int i=0; i<10; i++) {
			list.InsertAtHead(i);
		}*/
		list.InsertAtEndWithTail(1);
		list.InsertAtEndWithTail(2);
		list.InsertAtEndWithTail(3);
		list.InsertAtEndWithTail(1);
		list.printList();
		System.out.println("Is list a palindrome?  " + isPalindrome(list));
	}
	
	public static <T> boolean isPalindrome(DoublyLinkedList<T> list)
	{
		DoublyLinkedList.Node first = list.getHeadNode();
		DoublyLinkedList.Node last = list.getLastNode();
		
		if(first == null)
		{
			System.out.println("list is empty");
			return true;
		}
		
		while(first != null)
		{
			if(first.data != last.data)
			{
				return false;
			}
			first= first.nextNode;
			last = last.prevNode;
		}
		
		return true;
	}

}


// first will take first and last pointer
//check if list is empty then its palindrome
//traverse list from first and last end so, we can check for palindrome
//if its not equal then return false otherwise true