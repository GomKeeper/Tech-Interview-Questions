package thpark.pies.ch05trees;

import thpark.library.*;

public class ConvertToBST {

	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		TreeNode convertedArray = convertArray(intArray);
		
		preOrderPrint(convertedArray, 0);
	}

	public static TreeNode convertArray(int[] intArray) {
		int end = intArray.length-1;
		
		return doConvertArray(intArray, 0, end);
	}
	
	public static TreeNode doConvertArray(int[] array, int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = (start + end) >>> 1;
		TreeNode subRoot = new TreeNode(array[mid]);
		subRoot.left = doConvertArray(array, start, mid-1);
		subRoot.right = doConvertArray(array, mid+1, end);
		
		return subRoot;
	}
	
	public static void preOrderPrint(TreeNode root, int level) {
		if(root == null) { return ;}
		System.out.println("Level: " + level + " Value = " + root.data);
		preOrderPrint(root.left, level+1);
		preOrderPrint(root.right, level+1);
	}

}
