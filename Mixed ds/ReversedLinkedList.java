package examples;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ReversedLinkedList {
	
	 public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	
	 public ListNode reverseList(ListNode head) {
		 
		ListNode CurrentNode = head;
		ListNode prev = null;
		
		while(CurrentNode != null)
		{
			ListNode tempNode = CurrentNode.next;
			CurrentNode.next = prev;
			prev = CurrentNode;
			CurrentNode = tempNode;
		}	 
		return prev;
	        
	    }

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

	}

}
