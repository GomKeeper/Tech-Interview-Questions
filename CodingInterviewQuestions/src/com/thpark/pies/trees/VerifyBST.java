package com.thpark.pies.trees;

import com.thpark.library.TreeNode;

public class VerifyBST {

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
		
		isBST(root);
	}
	
	public static void isBST(TreeNode root) {
		if(root == null) { return; }
		
		boolean bst = isThisBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		if(bst) { System.out.println("This is a BST!!"); }
		else { System.out.println("This is NOT a BST!!"); }
		
	}
	
	public static boolean isThisBST(TreeNode root, int lowerLimit, int upperLimit) {
		if(root == null) { return true; }
		
		if((root.data < lowerLimit) || (upperLimit <= root.data)) {
			return false;
		}
		
		return isThisBST(root.left, lowerLimit, root.data) && isThisBST(root.right, root.data, upperLimit);
	}

}
