import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) 
    {
         ArrayList<ArrayList<Integer>>  res = new ArrayList<>();
        int cnt =0;
        int left = 1;
        int right =2;
        cnt = left+right;
        ArrayList<Integer> cur = new ArrayList<>();
        cur.add(left);
        cur.add(right);
        while(left<=sum/2)
        {
            if(cnt==sum)
            {
                res.add(new ArrayList<>(cur));
                cnt-=left;
                left++;
                cur.remove(0);
            }
            else if(cnt<sum)
            {
                right++;
                cur.add(right);
                cnt+=right;
            }
            else
            {
                cur.remove(0);
                cnt-=left;
                left++;
            }
        }
        return res;       
    }
}