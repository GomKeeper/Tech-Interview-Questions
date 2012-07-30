package thpark.library;

public class TreeNodeWP {
	public TreeNodeWP parent;
	public TreeNodeWP left;
	public TreeNodeWP right;
	public int data;
	
	public TreeNodeWP(int input) {
		this.data = input;
	}

	public TreeNodeWP(int input, TreeNodeWP left, TreeNodeWP right) {
		this.data = input;
		this.left = left;
		this.right = right;
	}
}
