package examples;

import java.util.LinkedList;

public class FindMiddleOfLinkedList {
	
	public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	
	public static ListNode middleNode(ListNode head)
	{
		//solution 1 //using array
		ListNode[] a = new ListNode[100];
		int index =0;
		
		while(head != null)
		{
			a[index++] = head;
			head = head.next;
		}
		return a[index/2];
	}
		
		//solution 2 //using length of the ll
		public ListNode middleNode1(ListNode head) {
		    ListNode curr = head;
		    
		    int total = 0;
		    while(curr != null){
		        total++;
		        curr = curr.next;
		    }        
		    
		    //find the middle one
		    total = total/2 + 1;
		    
		    curr = head;
		    for(int i = 1; i < total; ++i){
		    	curr = curr.next;
		    }
		    
		    return curr;
		}
		
		//solution 3 // using fast n slow pointer
		public ListNode middleNode2(ListNode head) {
	        ListNode slow = head, fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
	//	ListNode l = middleNode(head);

	}

}
