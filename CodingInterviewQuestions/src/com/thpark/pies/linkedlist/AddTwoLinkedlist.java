package com.thpark.pies.linkedlist;

import com.thpark.library.*;

public class AddTwoLinkedlist {

	public static void main(String[] args) {
		Node head01 = new Node(5);
		Node node02 = new Node(6);
		Node node03 = new Node(9);
		
		head01.next = node02;
		node02.next = node03;
		
		Node head11 = new Node(7);
		Node node12 = new Node(4);
		Node node13 = new Node(6);
		
		head11.next = node12;
		node12.next = node13;
		
		Node addNode = addTwoLinkedlist(head01, head11);
		
		while(addNode!= null) {
			System.out.print(addNode.data + " ");
			addNode = addNode.next;
		}
	}

	public static Node addTwoLinkedlist(Node fNode, Node sNode) {
		if(fNode == null || sNode == null) { return null; }
		int carry = 0;
		
		return doAddTwoLinkedlist(fNode, sNode, carry);
	}
	
	public static Node doAddTwoLinkedlist(Node fNode, Node sNode, int carry) {
		int sum = carry;
		if(fNode != null) { sum += fNode.data; }
		if(sNode != null) { sum += sNode.data; }
		Node currentNode = new Node(sum % 10);
		if(fNode != null || sNode != null) {
			Node nextNode = doAddTwoLinkedlist(fNode == null ? null : fNode.next,
											   sNode == null ? null : sNode.next,
													   (sum < 10 ? 0 : 1));
			currentNode.next = nextNode;
		}
		return currentNode;
	}
}
