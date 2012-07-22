package com.thpark.pies.linkedlist;

import com.thpark.library.Node;

public class ReverseLinkedlist {
	
	public static void main(String[] args) {
		Node node01 = new Node(1);
		Node node02 = new Node(2);
		Node node03 = new Node(3);
		Node node04 = new Node(4);
		
		node01.next = node02;
		node02.next = node03;
		node03.next = node04;
		
		Node head = node01, iterNode = node01;
		
		while(iterNode != null) {
			System.out.print(iterNode.data);
			if(iterNode.next != null) { System.out.print(" -> "); }
			iterNode = iterNode.next;
		}
		System.out.println();
		
		Node revNode = reverseLinkedlist(head);
		Node recNode = revNode;
		
		while(revNode != null) {
			System.out.print(revNode.data);
			if(revNode.next != null) { System.out.print(" -> "); }
			revNode = revNode.next;
		}
		System.out.println();
		
		Node newNode = recursiveRevLinkedlist(recNode);
		
		while(newNode != null) {
			System.out.print(newNode.data);
			if(newNode.next != null) { System.out.print(" -> "); }
			newNode = newNode.next;
		}
		System.out.println();
	}
	
	//static method for reverse linkedlist
	public static Node reverseLinkedlist(Node currNode) {
		if(currNode == null) { return null; }
		if(currNode.next == null) { return currNode; }
		Node prevNode = null, tempNode;
		while(currNode != null) {
			tempNode = currNode.next; // store the next node.
			currNode.next = prevNode; // change the next to the prev node.
			prevNode = currNode; // assign prevNode to current node.
			currNode = tempNode; // now assigne the current node to the next node.
		} //while
		
		return prevNode;
	} //reverseLinkedlist
	
	public static Node recursiveRevLinkedlist(Node currNode) {
		if(currNode == null) { return null; }
		if(currNode.next == null) { return currNode; }
		Node initialNode = null, nextNode;
		
		nextNode = currNode.next;
		currNode.next = null;
		initialNode = recursiveRevLinkedlist(nextNode);
		nextNode.next = currNode;
		
		return initialNode;
	}//recursiveRevLinkedlist
}
