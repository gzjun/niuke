//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) 
    {
      int res =0;
        for(int i=0;i<array.length;i++)
            res = res ^array[i];
        int indexBit = findFistBit(res);
        num1[0] = 0;
        num2[0] = 0;
        for(int i=0;i<array.length;i++)
        {
            if(((array[i]>>indexBit)&1)==1) {
                num1[0] = num1[0] ^ array[i];
            }
            else
                num2[0] = num2[0]^array[i];
        }
    }

    private int findFistBit(int res)
    {
        int cnt = 0;
        while(res!=0)
        {
            if((res&1)==1)
                return cnt;
            else
                res = res>>>1;
            cnt++;
        }
        return cnt;
    }

}