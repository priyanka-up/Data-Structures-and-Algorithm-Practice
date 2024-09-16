package treexamples;

public class isSymmerticTree {
	
	public  static boolean findTreeSymmetric(Node root) {
        return isSymmetricHelper(root, root);        
    }
    
    public static boolean isSymmetricHelper(Node root1, Node root2)
    {
        if(root1 == null && root2== null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        return root1.getData() == root2.getData() &&  isSymmetricHelper(root1.getLeftChild(), root2.getRightChild()) && isSymmetricHelper(root1.getRightChild(), root2.getLeftChild());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k=2;
		binaryTree tree = new binaryTree();		
		tree.add(1);
		tree.add(2);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		tree.add(4);
		tree.add(3);
		
		System.out.println(findTreeSymmetric(tree.getRoot()));

	}

}
