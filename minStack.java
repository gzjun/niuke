import java.util.PriorityQueue;
import java.util.Stack;

public class Solution 
{
    Stack<Integer> st = new Stack<Integer>();
    Stack<Integer> min = new Stack<>();
    public void push(int node)
    {
    	st.push(node);
        
        if(min.isEmpty() || node<min.peek())
            min.push(node);
        else
            min.push(min.peek());
    }
    
    public void pop()
    {
        st.pop();
        min.pop();
    }
    
    public int top()
    {
        return st.peek();
    }
    
    public int min()
    {
        return min.peek();
    }
}