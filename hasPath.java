public class Solution {
    boolean  [] visit;
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        visit = new boolean[matrix.length];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(hasPath(matrix,rows,cols,i,j,str,0))
                    return true;
            }
        }
        return false;
    }
    
    private boolean hasPath(char[] matrix,int rows,int cols,int row,int col,char[] str,int index)
    {
        if(index>=str.length)
            return true;
        if(row<0 || row>=rows || col<0 || col>=cols)
            return false;
        if(visit[row*cols+col])
            return false;
        if(matrix[row*cols+col]== str[index])
        {
            visit[row*cols+col] = true;
            boolean res =hasPath(matrix,rows,cols,row+1,col,str,index+1) || 
                    hasPath(matrix,rows,cols,row-1,col,str,index+1) ||
                    hasPath(matrix,rows,cols,row,col+1,str,index+1) ||
                    hasPath(matrix,rows,cols,row,col-1,str,index+1);    
            visit[row*cols+col] = false;
            return res;
        }

        else
            return false;
            
    }
}