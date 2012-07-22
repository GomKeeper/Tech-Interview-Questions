package com.thpark.pies.trees;

import java.util.LinkedList;
import java.util.Queue;

import com.thpark.library.TreeNode;

public class SumOfPaths {
	

	public static void main(String[] args) {
		
		TreeNode leaf02 = new TreeNode(1);
		TreeNode leaf07 = new TreeNode(3);
		TreeNode leaf08 = new TreeNode(8);
		
		TreeNode mid01 = new TreeNode(2, null, leaf02);
		TreeNode mid02 = new TreeNode(3, null, null);
		TreeNode mid04 = new TreeNode(-3, leaf07, leaf08);
		
		TreeNode upper01 = new TreeNode(-1, mid01, mid02);
		TreeNode upper02 = new TreeNode(2, null, mid04);
		
		TreeNode root = new TreeNode(4, upper01, upper02);
		
		int n = 5;
		
		traverseTree(root, n);
	}
	
	public static void traverseTree(TreeNode root, int n) {
		if(root == null) { return ; }
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		nodes.add(root);
		while(!nodes.isEmpty()) {
			TreeNode currRoot = nodes.remove();
			printSumOfPath(currRoot, n, new StringBuffer(), 0, true);
			if(currRoot.left != null) { 
				nodes.add(currRoot.left); 
			}
			if(currRoot.right != null) {
				nodes.add(currRoot.right);
			}
		}
	}
	
	public static void printSumOfPath(TreeNode node, int n, StringBuffer str, int sum, boolean isRoot) {
		if(isRoot) { 
			str.append(node.data); 
			isRoot = false;
		} else {
			str.append(" -> ");
			str.append(node.data);
		}
		int localSum = sum + node.data;
		if(localSum == n) {
			System.out.println(str);
		}
		if(node.left != null) { 
			printSumOfPath(node.left, n, new StringBuffer(str), localSum, isRoot); 
		}
		if(node.right != null) { 
			printSumOfPath(node.right, n, new StringBuffer(str), localSum, isRoot);
		}
	}
}
