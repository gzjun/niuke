import java.util.*;


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
    ArrayList<ArrayList<Integer> > Print(TreeNode root) 
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            ArrayList<Integer> temp = new ArrayList<>();
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode node = q.poll();
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
                temp.add(node.val);
            }
            res.add(new ArrayList<>(temp));
        }
        return res;
    }
    
}