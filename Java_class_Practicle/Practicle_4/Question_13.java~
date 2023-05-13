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

class SLL
{
	Node head;
	
	public SLL()
	{
		head = null;
	
	}
	
	void addAtEnd(int d)
	{
		
		if(head==null)
		{
			head = new Node(d);
			return;
		}
		
		Node p =head;
		
		while(p.next!=null)
		{
			p=p.next;
		}
		
		p.next=new Node(d);
	
	}
	
	void addAtBegin(int d)
	{
		if(head==null)
		{
			head = new Node(d);
			return;
		}
		
		
		
		Node p=new Node(d);
		
		p.next=head;
		head = p;
		
	
		
	}
	
	
	int deleteAtBegin()
	{
		
		if (head==null)
		{
		
			System.out.println("List underflow");
			return 0;
		}
		
		Node p =head;
		
		int d  = p.data;
		
		head   =p.next;
		
		p.next=null;
		return d;
	
	}
	
	int deleteAtEnd()
	{	
		if(head==null)
		{
			System.out.println("List Underflow");
			return 0;
		
		}
		
		
		Node p=head;
		
		Node q=null;
		while(p.next!=null)
		{
			q=p;
			p=p.next;
			
		}
		
		int d = p.data;
		q.next=null;
		
		return d;
	
	}
	
	void show()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		
			return;

		}
		
		
		Node p =head;
		
		while(p!=null)
		{
			System.out.println(p.data+" " );
			p=p.next;
		}
		System.out.println();	
	
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
			
			addAtEnd(d);
		}	
		
			
			
	}
	
}

class Question_13
{
	public static void main(String [] args)
	{
		SLL s1 = new SLL();
		
		s1.create();
		s1.show();
		
	}
}
