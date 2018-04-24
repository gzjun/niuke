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

    public ListNode EntryNodeOfLoop(ListNode head)
    {
        if(head==null || head.next==null)
            return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)
                break;
        }
        fast = head;
        while(fast!=slow)
        {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}