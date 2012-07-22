package com.thpark.amazon;

public class interveiw02 {

	public class Node {
	    public Node next;
	    public Object data;
	}


	public static Node reverseLinkedList(Node head) {
	    if(head == null) { return null; }
	    Node prevNode, iterNode, tempNode;
	    
	    prevNode = head;
	    prevNode.next = null;
	    iterNode = head.next;
	    while(iterNode != null) {
	        tempNode = iterNode.next; //assign a Temporary Node to next linkedList in the original linked list
	        iterNode.next = prevNode; // reverse the link
	  
	        prevNode = iterNode; // increment to the next linkedList to be pointed. prevNode will get .next on the next iteration. 
	        iterNode = tempNode; //increment to the next linkedList in the origial linkedList.
	    }
	    
	    return prevNode;
	    
	}

}