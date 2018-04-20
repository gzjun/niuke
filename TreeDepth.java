
import java.util.*;
public class Solution {
    public int TreeDepth(TreeNode root) 
    {
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
            return 0;
        int res=0;
        q.add(root);
        while(!q.isEmpty())
        {
            int n =q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode node = q.poll();
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            res++;
        }
        return res;
    }
}