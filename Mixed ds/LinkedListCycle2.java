package examples;

import examples.FindMiddleOfLinkedList.ListNode;

public class LinkedListCycle2 {
	
	public boolean hasCycle(ListNode head)
	{
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
				return true;
		}
		return false;
	}

}

//space complexity ->o(1)
//time complexity-> o(n)
