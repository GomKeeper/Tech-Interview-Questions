package thpark.interview.amazon;

import thpark.library.Node;

public class interview02_sol {

	public static void main(String[] args) {

		Node node01 = new Node(1);
		Node node02 = new Node(2);
		Node node03 = new Node(3);
		Node node04 = new Node(4);
		
		node01.next = node02;
		node02.next = node03;
		node03.next = node04;
		
		Node revNode = reverseLinkedlist(node01);
		
		while(revNode != null) {
			System.out.print(revNode.data + " ");
			revNode = revNode.next;
		}
		
	}

	public static Node reverseLinkedlist(Node head) {
		if(head == null) { return null; }
		
		Node prevNode = null, tempNode;
		
		while(head != null) {
			tempNode = head.next; // save next position to temp;
			head.next = prevNode;
			prevNode = head;
			head = tempNode;
		}
		
		return prevNode;
	}
}
