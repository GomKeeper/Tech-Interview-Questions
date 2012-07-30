package thpark.pies.ch04linkedlist;

import java.util.Hashtable;

import thpark.library.Node;


public class LinkedlistIntersection {

	public static void main(String[] args) {
		
		Node list01 = new Node(1);
		Node list02 = new Node(2);
		Node list03 = new Node(3);
		Node list04 = new Node(4);
		Node list05 = new Node(5);
		Node list06 = new Node(6);
		Node list07 = new Node(7);
		Node list08 = new Node(8);
		
		Node list09 = new Node(13);
		Node list10 = new Node(10);
		Node list11 = new Node(6);
		Node list12 = new Node(9);
		Node list13 = new Node(3);
		Node list14 = new Node(11);
		Node list15 = new Node(8);
		Node list16 = new Node(20);
		
		list01.next = list02;
		list02.next = list03;
		list03.next = list04;
		list04.next = list05;
		list05.next = list06;
		list06.next = list07;
		list07.next = list08;

		list09.next = list10;
		list10.next = list11;
		list11.next = list12;
		list12.next = list13;
		list13.next = list14;
		list14.next = list15;
		list15.next = list16;
		
		Node firstHead = list01;
		Node secondHead = list09;
		
		Node newNode = findIntersect(firstHead, secondHead);
		
		while(newNode != null) {
			System.out.println("Intersection = " + newNode.data);
			newNode = newNode.next;
		}
	}
	
	public static Node findIntersect(Node fNode, Node sNode) {
		if(fNode == null || sNode == null) { return null; }
		
		Node resultNode = new Node(0);
		Node iterNode = resultNode;
		Hashtable<Integer, Integer> myHash = new Hashtable<Integer, Integer>();
		while(fNode != null) {
			myHash.put(fNode.data, 1);
			fNode = fNode.next;
		}
		while(sNode != null) {
			if(myHash.containsKey(sNode.data)) {
				//System.out.println(sNode.data);
				iterNode.next = new Node(sNode.data);
				iterNode = iterNode.next;
			}
			sNode = sNode.next;
		}
		return resultNode.next;
	}

}
