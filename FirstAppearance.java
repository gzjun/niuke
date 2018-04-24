import java.util.*;
public class Solution {
    //Insert one char from stringstream
    Queue<Character> q;
    int [] nums;
    public Solution()
    {
       q = new LinkedList<>();
       nums = new int[256];
        for(int i=0;i<256;i++)
            nums[i]=0;
           
    }
    public void Insert(char ch)
    {
        if(nums[ch]==0)
        {
            q.add(ch);
        }
        nums[ch]++;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        while(!q.isEmpty())
        {
            if(nums[q.peek()]==1)
                return q.peek();
            q.poll();
        }
        return '#';
    }
}