public class Solution {
    public int FindGreatestSumOfSubArray(int[] array)
    {
        int n =array.length;
        int [] dp = new int[n];
        int res = Integer.MIN_VALUE;
        dp[0] = array[0];
        for(int i=1;i<n;i++)
        {
            dp[i] = array[i];
            dp[i] = Math.max(dp[i-1]+array[i],dp[i]);
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}