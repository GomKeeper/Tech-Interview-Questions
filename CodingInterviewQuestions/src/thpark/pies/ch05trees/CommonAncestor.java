package thpark.pies.ch05trees;

import thpark.library.TreeNode;

public class CommonAncestor {

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
		
		int input01 = 3	, input02 = 8;
	
		System.out.println("Common Ancestor = " + detectCommonAncestor(root, input01, input02));
	}

	public static int detectCommonAncestor(TreeNode root, int input01, int input02) {
		if(root == null) { return -1; }
		if(input01 < 1 || input02 < 1) { return -2; }
		if(!checkExistence(root,input01) || !checkExistence(root,input02)) {
			return -3;
		}
		return doDetectCommonAncestor(root, input01, input02);
	}
	
	public static int doDetectCommonAncestor(TreeNode root, int input01, int input02) {	
		
		if (input01 < root.data && input02 < root.data) {
			return detectCommonAncestor(root.left, input01, input02);
		} else if (input01 > root.data && input02 > root.data) {
			return detectCommonAncestor(root.right, input01, input02);
		} else { 
			return root.data;
		}
		
	}
	
	public static boolean checkExistence(TreeNode root, int n) {
		if(root == null) { return false; }
		if(root.data == n) { return true; }
		if(n < root.data && root.left != null) {
			return checkExistence(root.left, n)	;
		} else if(root.right != null) {
			return checkExistence(root.right, n);
		} else {
			return false;
		}
		
	}
}
