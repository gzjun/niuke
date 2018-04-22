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
public class Solution 
{
    int index=-1;
    String Serialize(TreeNode root)
    {
        StringBuilder sb = new StringBuilder();
        if(root==null)
            return "$,";
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }
    TreeNode Deserialize(String str)
    {
        index++;
        String [] arr = str.split(",");
        TreeNode root = null;
        if(index>arr.length)
        {
            return null;
        }
        if(!arr[index].equals("$"))
        {
            root = new TreeNode(Integer.parseInt(arr[index]));
            root.left = Deserialize(str);
            root.right = Deserialize(str);
        }
        return root;
    }
}