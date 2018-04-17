import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    // base on Partition has run out of time, and the PriorityQueue is used to solve this problem
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] nums, int k)
    {
        if(nums.length<k)
            return new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        for(int i=0;i<k;i++)
            res.add(pq.poll());
        return res;
    }
}