import java.util.Scanner;
import java.util.Stack;

class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			SortStack g=new SortStack();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}

class SortStack{
    
	public Stack<Integer> sort(Stack<Integer> s)
	{
		int currentElement;
		if(s.isEmpty())
		    return s;
	
		currentElement = s.pop();
		sort(s);
		insertSorted(s,currentElement);
		return s;
	}
	
	public static void insertSorted(Stack<Integer> s, int element){
	    if(s.isEmpty()){
	        s.push(element);
	    } else if(s.peek() > element){
	        int greater = s.pop();
	        insertSorted(s,element);
	        s.push(greater);
	    } else
	        s.push(element);
	}
	
}
