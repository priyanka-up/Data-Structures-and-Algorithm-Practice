package treexamples;
//lowest common ancestors

public class LCAOfBinaryTree {
	
	/* recursive
	public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }
}*/
	
	/* iterative
	 * class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        while(root != null)
        {
            if(root.val > p.val && root.val> q.val)
            {
                root = root.left;
            }
            else if(root.val < p.val && root.val < q.val)
            {
                root = root.right;
            }
            else
                return root;
        }
        return null;
     }
}
	 * 
	 */

	

	public static void main(String args[])
	{
        binaryTree tree = new binaryTree();
		tree.add(6);
		tree.add(4);
		tree.add(9);
		tree.add(2);
		tree.add(5);
		tree.add(8);
		tree.add(12);
		tree.add(10);
		tree.add(14);
		
		
	}


}
