package ikTree;

import java.util.List;

import treexamples.Node;

public class TreeNode102 {
	
	//102
	private int data;
	private TreeNode102 leftChild;
	private TreeNode102 rightChild;
	private List<TreeNode429> children;
		
	public TreeNode102(int value)
	{
		this.data = value;
		leftChild = null;
		rightChild = null;		
	}
	
	public TreeNode102(int val, List<TreeNode429> children) {
        this.data = data;
        this.setChildren(children);
    }

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode102 getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode102 leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode102 getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode102 rightChild) {
		this.rightChild = rightChild;
	}

	public List<TreeNode429> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode429> children) {
		this.children = children;
	}
	
	
	
}
