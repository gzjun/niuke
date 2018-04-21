import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(num.length<size || size==0)
            return res;
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<num.length;i++)
        {
            while(!dq.isEmpty() && num[i]>=num[dq.getLast()])
                dq.pollLast();
            
            while(!dq.isEmpty() && dq.getFirst()<i-(size-1))
                dq.pollFirst();
            
            dq.add(i);
            if(i+1>=size)
            {
                res.add(num[dq.getFirst()]);
            }
        }

        return res;        
    }
}