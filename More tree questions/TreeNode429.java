package ikTree;

import java.util.List;

public class TreeNode429 {

    
    private int data;
	private TreeNode429 leftChild;
	private TreeNode429 rightChild;
	public List<TreeNode429> children;
		
	public TreeNode429(int value)
	{
		this.data = value;
		leftChild = null;
		rightChild = null;		
	}
	
	public TreeNode429(int val, List<TreeNode429> children) {
        this.data = data;
        this.children = children;
    }

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode429 getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode429 leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode429 getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode429 rightChild) {
		this.rightChild = rightChild;
	}
	
	

}
