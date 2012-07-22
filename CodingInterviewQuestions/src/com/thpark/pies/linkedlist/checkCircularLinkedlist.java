package com.thpark.pies.linkedlist;

import com.thpark.library.Node;

public class checkCircularLinkedlist {

	public static void main(String[] args) {
		Node list01 = new Node(1);
		Node list02 = new Node(2);
		Node list03 = new Node(3);
		Node list04 = new Node(4);
		Node list05 = new Node(5);
		Node list06 = new Node(6);
		Node list07 = new Node(7);
		Node list08 = new Node(8);
		
		list01.next = list02;
		list02.next = list03;
		list03.next = list04;
		list04.next = list05;
		list05.next = list06;
		list06.next = list07;
		list07.next = list08;
		list08.next = list03;
		
		System.out.println("Is this a circular linked list ? " + ((checkCircular(list01) > 0)? "YES" : "NO"));
	}

	public static int checkCircular(Node head) {
		if(head == null) { return -1; }
		if(head.next == null) { return 0; }
		Node fastNode = head.next, slowNode = head;
		while(true) {
			if(fastNode == null || fastNode.next == null) {
				return 0;
			} //if
			if(fastNode == slowNode || fastNode.next == slowNode) {
				return 1;
			}
			fastNode = fastNode.next.next;
			slowNode = slowNode.next; 
		}
	}
}
