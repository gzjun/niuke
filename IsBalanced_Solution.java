public class Solution {
    public boolean IsBalanced_Solution(TreeNode root)
    {
        if(root==null)
            return true;
        return height(root)!=-1;
    }

    private int height(TreeNode root) 
    {
        if(root==null)
            return 0;
        int LH = height(root.left);
        if(LH==-1)
            return -1;
        int RH = height(root.right);
        if(RH==-1)
            return -1;
        if(LH-RH<-1 || LH-RH>1)
            return -1;
        return Math.max(LH,RH)+1;
    }
}