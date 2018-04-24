/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode head)
    {
        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode node = head;
        ListNode pre = root;
        while(node!=null && node.next != null)
        {
            if(node.val==node.next.val)
            {
               int val = node.val;
                while(node!=null && node.val == val)
                    node = node.next;
                pre.next = node;
            }
            else
            {
                pre = node;
                node = node.next;
            }
        }
        return root.next;
    }
}