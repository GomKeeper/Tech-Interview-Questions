package com.thpark.library;

import java.util.Stack;

public 	class Tower {
	private Stack<Integer> disks;
	private int towerNum;
	
	public Tower(int n) {
		this.disks = new Stack<Integer>();
		this.towerNum = n;
	}
	
	public int getTowerNum() {
		return this.towerNum;
	}
/*	
	public void add(int n) {
		if(this.disks.isEmpty() || this.disks.peek() <= n) {
			System.out.println("Error placing disk " + n);
		} else {
			this.disks.push(n);
		}
	}
*/	
	public void add(int n) {
		this.disks.push(n);
	}
	
	public void moveTopTo(Tower t) {
		int topDisk = this.disks.pop();
		t.add(topDisk);
		System.out.println("Move disk " + topDisk + " from " + this.getTowerNum() + " to " + t.getTowerNum());
	}
	
	public void moveDisks(int n, Tower dest, Tower buffer) {
		if(n >= 1) {
			this.moveDisks(n-1, buffer, dest);
			this.moveTopTo(dest);
			buffer.moveDisks(n-1, dest, this);
		}
	}
}