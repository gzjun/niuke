import java.util.*;
public class Solution {
    public boolean isContinuous(int [] numbers) 
    {
        if(numbers==null || numbers.length==0)
            return false;
         Arrays.sort(numbers);
        int numOfZero = 0;
        int numOfGap = 0;
        for(int i=0;i<numbers.length &&numbers[i]==0;i++)
            numOfZero++;
        for(int i=numOfZero+1;i<numbers.length;i++)
        {
            if(numbers[i]==numbers[i-1])
                return false;
            numOfGap+=numbers[i]-numbers[i-1]-1;
        }
        return numOfZero>=numOfGap;       
    }
}