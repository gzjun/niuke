import java.util.*;
public class Solution {
    public int GetNumberOfK(int [] array , int k) 
    {
        int index = Arrays.binarySearch(array,k);
        if(index<0)
            return 0;
        int i = index-1;
        int j=index+1;
        while(j<array.length && array[j]==k)
            j++;
        while(i>=0 && array[i]==k)
            i--;
        return j-i-1;
    }
}