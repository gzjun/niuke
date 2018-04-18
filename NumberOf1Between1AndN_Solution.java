public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) 
    {
        int count = 0;
        int round = n;
        int base =1;
        while(round>=1)
        {
            int weight = round%10;
            round = round/10;
            count+=round*base;
            if(weight==1)
                count+=(n%base)+1;
            if(weight>1)
                count+=base;
            base = base*10;
        }
        return count;
    }
}