package examples;

import java.util.HashSet;



public class LinkedListCycle {
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
	public boolean hasCycle(ListNode head)
	{
		HashSet<Integer> hset = new HashSet<Integer>();
		while(head != null)
		{
			if(hset.contains(head))
				return true;
			hset.add(head);
			head = head.next;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
