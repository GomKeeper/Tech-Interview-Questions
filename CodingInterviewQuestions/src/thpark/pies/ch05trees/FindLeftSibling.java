package thpark.pies.ch05trees;

import thpark.library.TreeNodeWP;

public class FindLeftSibling {

	public static void main(String[] args) {
		TreeNodeWP leaf01 = new TreeNodeWP(5);
		TreeNodeWP leaf02 = new TreeNodeWP(8);
		TreeNodeWP leaf03 = new TreeNodeWP(10);
		TreeNodeWP leaf04 = new TreeNodeWP(18);
		
		TreeNodeWP leaf05 = new TreeNodeWP(50);
		TreeNodeWP leaf06 = new TreeNodeWP(60);
		TreeNodeWP leaf07 = new TreeNodeWP(80);
		TreeNodeWP leaf08 = new TreeNodeWP(100);
		
		TreeNodeWP mid01 = new TreeNodeWP(7, leaf01, leaf02);
		TreeNodeWP mid02 = new TreeNodeWP(14, leaf03, leaf04);
		TreeNodeWP mid03 = new TreeNodeWP(55, leaf05, leaf06);
		TreeNodeWP mid04 = new TreeNodeWP(90, leaf07, leaf08);
		
		TreeNodeWP upper01 = new TreeNodeWP(9, mid01, mid02);
		TreeNodeWP upper02 = new TreeNodeWP(70, mid03, mid04);
		
		TreeNodeWP root = new TreeNodeWP(40, upper01, upper02);
	
		leaf01.parent = mid01;
		leaf02.parent = mid01;
		leaf03.parent = mid02;
		leaf04.parent = mid02;
		leaf05.parent = mid03;
		leaf06.parent = mid03;
		leaf07.parent = mid04;
		leaf08.parent = mid04;
		mid01.parent = upper01;
		mid02.parent = upper01;
		mid03.parent = upper02;
		mid04.parent = upper02;
		upper01.parent = root;
		upper02.parent = root;
		
		TreeNodeWP myNode = findLeftSib(leaf01);
		
		System.out.println(myNode==null ? null : myNode.data);
	}
	
	public static TreeNodeWP findLeftSib(TreeNodeWP startNode) {
		if(startNode == null || startNode.parent == null) { return null; }
		return doFindLS(startNode.parent, startNode, 1);
	}
	
	public static TreeNodeWP doFindLS(TreeNodeWP currNode, TreeNodeWP prevNode, int level) {
		if(currNode == null) { return null; }
		else if(level == 0) { return currNode; }
		int step = 0;
		if(prevNode == currNode.parent) {
			step = 1;
		} else if(prevNode == currNode.right) {
			step = 2;
		} else if (prevNode == currNode.left) {
			step = 3;
		} else { 
			return null;
		}
		switch(step) {
				case 1 :					
					if(currNode.right != null) {
						return doFindLS(currNode.right, currNode, level-1);
					}
				case 2 : 
					if(currNode.left != null) {
						return doFindLS(currNode.left, currNode, level-1);
					}
				case 3 :
					if(currNode.parent != null) {
						return doFindLS(currNode.parent, currNode, level+1);
					}
				default :
					return null;
		}
		
	}
	
	

}
