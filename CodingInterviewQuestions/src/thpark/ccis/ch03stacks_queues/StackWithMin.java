package thpark.ccis.ch03stacks_queues;

import java.util.Stack;

@SuppressWarnings("serial")
public class StackWithMin extends Stack<Integer> {
	private Stack<Integer> minStack;
	
	public StackWithMin() {
		super();
		minStack = new Stack<Integer>();
	}
	
	public void push(int i) {
		if(minStack.isEmpty() || i < minStack.peek()) {
			minStack.push(i);
		}
		super.push(i);
	}

	public Integer pop() {
		int popped = super.pop();
		if(popped == minStack.peek()) {
			minStack.pop();
		}
		return popped;
	}
	
	public Integer min() {
		if(minStack.isEmpty()) { return null; }
		return minStack.peek();
	}

	
	public static void main(String[] args) {
		StackWithMin myStack = new StackWithMin();
		
		myStack.push(4);
		myStack.push(8);
		myStack.push(2);
		myStack.push(10);
		myStack.push(5);
		myStack.push(50);
		
		System.out.println("current Min = " + myStack.min());
		
		myStack.pop();
		
		System.out.println("current Min = " + myStack.min());
		
		myStack.pop();
		
		System.out.println("current Min = " + myStack.min());
		
		myStack.pop();
		
		System.out.println("current Min = " + myStack.min());
		
		myStack.pop();
		
		System.out.println("current Min = " + myStack.min());
		
		myStack.pop();
		
		System.out.println("current Min = " + myStack.min());
		
	}

}
