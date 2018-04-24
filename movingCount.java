public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean [] visit = new boolean[rows*cols];
        int count = helper(threshold,rows,cols,0,0,visit);
        return count;
    }
    private int helper(int k, int rows, int cols, int row, int col, boolean[] visit)
    {
        int count =0;
        if(check(k,rows,cols,row,col,visit))
        {
            visit[row*cols+col] = true;
            count = 1+(helper(k,rows,cols,row-1,col,visit)+
                     helper(k,rows,cols,row+1,col,visit)+
                     helper(k,rows,cols,row,col+1,visit)+
                     helper(k,rows,cols,row,col-1,visit));
        }
        return count;
    }
    private boolean check(int k, int rows, int cols, int row, int col, boolean[] visit)
    {
        if(row<0 || row>=rows || col<0 || col>=cols || visit[row*cols+col]==true)
            return false;
        int res =0;
        while(row>0)
        {
            res+=row%10;
            row = row/10;
        }
        while(col>0)
        {
            res+=col%10;
            col = col/10;
        }
        return res<=k;
    }
}