public class Solution {
    public String ReverseSentence(String str) 
    {
        if(str.length()<=1)
            return str;
        String[] arr = str.split(" ");
        if(arr.length==0)
            return str;
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>0;i--) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        sb.append(arr[0]);
        return sb.toString();     
    }
}