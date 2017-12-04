import java.util.*;



class MinimumElementInStackInO1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			MinStack g = new MinStack();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}
class MinStack
{
    int minEle;
    Stack<Integer> s;
    Stack<Integer> minStack;
    /*returns min element from stack*/
    
    public GfG(){
        this.s = new Stack<Integer>();
        this.minStack = new Stack<Integer>();
    }
    
    int getMin()
    {
	    if(s.isEmpty())
	        return -1;
	    else
	        return minStack.peek();
    }
    
    /*returns poped element from stack*/
    int pop()
    {
        if(s.isEmpty())
            return -1;
        int element = s.pop();
	    if(element == minStack.peek()){
	        minStack.pop();
	    }
	    return element;
    }
    /*push element x into the stack*/
    void push(int x)
    {
	    s.push(x);        
	    if(!minStack.isEmpty() && minStack.peek() >= x){
	        minStack.push(x);
	    } else if(minStack.isEmpty()){
	        minStack.push(x);
	    }
    }	
}
