public class Solution {
    public int MoreThanHalfNum_Solution(int [] array)
    {
        if(array==null || array.length==0)
            return 0;
        int fre = 1;
        int res = array[0];
        for(int i=1;i<array.length;i++)
        {
            if(fre==0)
            {
                res = array[i];
                fre =1;
            }
            else if(array[i] == res)
                fre++;
            else
                fre--;
        }
        if(checkFre(array,res))
            return res;
        return 0;
    }
    public boolean checkFre(int[] array, int res)
    {
        int fre =0;
        for(int num:array)
            if(num==res)
                fre++;
        if(fre>array.length/2)
            return true;
        else
            return false;
    }
}