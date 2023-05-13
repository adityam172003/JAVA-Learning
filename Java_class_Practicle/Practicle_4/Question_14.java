import java.util.*;




class Node
{
	public int data;
	
	public Node next;
	
	public Node()
	{
		next=null;
		
	
	}
	
	public Node(int d)
	{
	
		data =d;
		
		next=null;
	}
	
	

}

class Stack
{
	Node top;
	
	public Stack()
	{
		top = null;
	
	}
	
	void push(int d)
	{
		
		if(top==null)
		{
			top = new Node(d);
			return;
		}
		
		Node p =top;
		
		
		Node  q =new Node(d);
		q.next  = top;
		top     = q;
	
	}
	
	int pop()
	{	
		if(top==null)
		{
			System.out.println("List Underflow");
			return 0;
		
		}
		
		
		Node p=top;
		Node q=top;
		int d = p.data;
		
		p=p.next;
		top=p;
		q.next=null;
		
		return d;
	
	}
	
	void show()
	{
		if(top==null)
		{
			System.out.println("List is empty");
		
			return;

		}
		
		
		Node p =top;
		
		while(p!=null)
		{
			System.out.println(p.data+" " );
			p=p.next;
		}
			
	
	}
	
	void create()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("keep enterign the data  to stop enter -1 : ");
		
		while(true)
		{	
			System.out.print(":");
			int d = sc.nextInt();
			if(d==-1)
			{
				return;
			}
			
			push(d);
		}	
		
			
			
	}
	
}

class Question_14
{
	public static void main(String [] args)
	{
		Stack s = new Stack();
		
		s.create();
		
		System.out.println(s.pop());
		
		s.show();
		
	}
}
