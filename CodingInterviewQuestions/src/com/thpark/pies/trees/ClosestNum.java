package com.thpark.pies.trees;

import com.thpark.library.TreeNode;

public class ClosestNum {

	public static void main(String[] args) {
		TreeNode leaf01 = new TreeNode(5);
		TreeNode leaf02 = new TreeNode(8);
		TreeNode leaf03 = new TreeNode(10);
		TreeNode leaf04 = new TreeNode(18);
		
		TreeNode leaf05 = new TreeNode(50);
		TreeNode leaf06 = new TreeNode(60);
		TreeNode leaf07 = new TreeNode(80);
		TreeNode leaf08 = new TreeNode(100);
		
		TreeNode mid01 = new TreeNode(7, leaf01, leaf02);
		TreeNode mid02 = new TreeNode(14, leaf03, leaf04);
		TreeNode mid03 = new TreeNode(55, leaf05, leaf06);
		TreeNode mid04 = new TreeNode(90, leaf07, leaf08);
		
		TreeNode upper01 = new TreeNode(9, mid01, mid02);
		TreeNode upper02 = new TreeNode(70, mid03, mid04);
		
		TreeNode root = new TreeNode(40, upper01, upper02);
		
		int n = 48;
		System.out.println("Closest Number of " + n + " is " + findClosestN(root,n));
	}

	public static int findClosestN(TreeNode root, int n) {
		if(root == null || n < 1) { return -1; }
		int closest = Integer.MAX_VALUE;
		return doFindClosestN(root, n, closest);
	}
	
	public static int doFindClosestN(TreeNode root, int n, int closest) {
		if(root == null ) { return closest; }
		if(root.data == n) { return n; }
		closest = (Math.abs(root.data-n) < Math.abs(closest - n) ) ? root.data : closest;
		if(n < root.data && root.left != null) {
			closest = doFindClosestN(root.left, n, closest);
		} else if (root.right != null) {
			closest = doFindClosestN(root.right, n, closest);
		}
		return closest;
	}
}
