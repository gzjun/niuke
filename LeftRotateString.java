public class Solution {
    public String LeftRotateString(String str,int n)
    {
        if(str.length() ==0)
            return str;
        n = n %str.length();
        int len = str.length();
        str+=str;
        return str.substring(n,n+len);
    }

}