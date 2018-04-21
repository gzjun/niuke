/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2)
    {
        if(pHead1==null || pHead2==null)
            return null;
        int l1 = 0;
        int l2 = 0;
        ListNode h1 = pHead1;
        ListNode h2 = pHead2;
        while(h1!=null)
        {
            h1= h1.next;
            l1++;
        }
        while(h2!=null)
        {
            h2 = h2.next;
            l2++;
        }
        h1 = pHead1;
        h2 = pHead2;
        if(l1>=l2)
        {
            for(int i=0;i<l1-l2;i++)
                h1=h1.next;
            while(h2!=null)
            {
                if(h2==h1)
                    return h1;
                else
                {
                    h1 = h1.next;
                    h2 = h2.next;
                }
            }
        }
        else if(l1<=l2)
        {
            for(int i=0;i<l2-l1;i++)
                h2=h2.next;
            while(h1!=null)
            {
                if(h2==h1)
                    return h1;
                else
                {
                    h1 = h1.next;
                    h2 = h2.next;
                }
            }
        }
        return null;
    }
}