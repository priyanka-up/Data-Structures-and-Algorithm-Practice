package treexamples;

public class Node {
	//variables
	//constructor
	//getter/setter
	
	private int data;
	private Node leftChild;
	private Node rightChild;
	
	
	
	public Node(int value)
	{
		this.data = value;
		leftChild = null;
		rightChild = null;		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
	
	

}
