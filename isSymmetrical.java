/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    boolean isSymmetrical(TreeNode root)
    {
       if(root==null)
           return true;
        return isSameTree(root.left,root.right);
    }
    boolean isSameTree(TreeNode left, TreeNode right)
    {
        if(left==null && right ==null)
            return true;
        else if(left==null || right==null)
            return false;
        else if(left.val!=right.val)
            return false;
        else
            return isSameTree(left.left,right.right) && isSameTree(left.right,right.left);
    }
}