package thpark.pies.ch04linkedlist;

import thpark.library.Node;

public class NthElement {

	public static void main(String[] args) {

		Node list01 = new Node(1);
		Node list02 = new Node(2);
		Node list03 = new Node(3);
		Node list04 = new Node(4);
		Node list05 = new Node(5);
		Node list06 = new Node(6);
		Node list07 = new Node(7);
		Node list08 = new Node(8);
		Node list09 = new Node(9);
		Node list10 = new Node(10);
		Node list11 = new Node(11);
		Node list12 = new Node(12);
		Node list13 = new Node(13);
		Node list14 = new Node(14);
		Node list15 = new Node(15);
		Node list16 = new Node(16);
		
		list01.next = list02;
		list02.next = list03;
		list03.next = list04;
		list04.next = list05;
		list05.next = list06;
		list06.next = list07;
		list07.next = list08;
		list08.next = list09;
		list09.next = list10;
		list10.next = list11;
		list11.next = list12;
		list12.next = list13;
		list13.next = list14;
		list14.next = list15;
		list15.next = list16;
		
		int i = 5, result;

		result = findNthElement(i, list01);
		System.out.println("The result is " + result);
	}

	public static int findNthElement(int n, Node head) {
		if(n < 0 || head == null) { return -1; }
		Node firstNode = head, secondNode = head;
		while(n > 0) { 
			firstNode = firstNode.next;
			n--;
		}
		while(firstNode.next != null) {
			firstNode = firstNode.next;
			secondNode = secondNode.next;
		}
		int result = (Integer)secondNode.data;
		return result;
		
	}
}
