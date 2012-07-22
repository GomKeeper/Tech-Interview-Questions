package com.thpark.library;

public class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int input) {
		this.data = input;
	}
	
	public TreeNode(int input, TreeNode left, TreeNode right) {
		this.data = input;
		this.left = left;
		this.right = right;
	}
	
}
