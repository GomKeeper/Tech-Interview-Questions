package com.thpark.pies.trees;

import com.thpark.library.TreeNode;

public class BlancedTree {

	public static void main(String[] args) {
		//TreeNode leaf01 = new TreeNode(5);
		TreeNode leaf02 = new TreeNode(8);
		TreeNode leaf03 = new TreeNode(10);
		TreeNode leaf04 = new TreeNode(18);
		
		TreeNode leaf05 = new TreeNode(50);
		TreeNode leaf06 = new TreeNode(60);
		TreeNode leaf07 = new TreeNode(80);
		TreeNode leaf08 = new TreeNode(100);
		
		TreeNode mid01 = new TreeNode(7, null, leaf02);
		TreeNode mid02 = new TreeNode(14, leaf03, leaf04);
		TreeNode mid03 = new TreeNode(55, leaf05, leaf06);
		TreeNode mid04 = new TreeNode(90, leaf07, leaf08);
		
		TreeNode upper01 = new TreeNode(9, mid01, mid02);
		TreeNode upper02 = new TreeNode(70, mid03, mid04);
		
		TreeNode root = new TreeNode(40, upper01, upper02);
		
		if(isBalanced(root) == 1) {
			System.out.println("This tree is balanced!");
		} else {
			System.out.println("This tree is NOT balanced!");
		}
	}
	
	public static int isBalanced(TreeNode root) {
		if(root == null) { return -1; }
		System.out.println("Max Depth = " + maxDepth(root));
		System.out.println("Min Depth = " + minDepth(root));
		return (Math.abs(maxDepth(root)-minDepth(root)) < 2) ? 1 : 0;
	}
	
	public static int maxDepth(TreeNode root) {
		if(root == null) { return 0; }
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	
	public static int minDepth(TreeNode root) {
		if(root == null) { return 0; }
		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}

}
