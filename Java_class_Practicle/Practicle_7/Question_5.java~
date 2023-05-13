import java.util.*;

import static java.lang.System.out;


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
		
			out.println("List underflow");
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
			out.println("List Underflow");
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
			out.println("List is empty");
		
			return;

		}
		
		
		Node p =head;
		
		while(p!=null)
		{
			out.print(p.data+" " );
			p=p.next;
		}
		out.println();	
	
	}
	
	void create()
	{
		Scanner sc = new Scanner(System.in);
		out.println("keep enterign the data  to stop enter -1 : ");
		
		while(true)
		{	
			out.print(":");
			int d = sc.nextInt();
			if(d==-1)
			{
				return;
			}
			
			addAtEnd(d);
		}	
		
			
			
	}
	
}



class Question_5
{
	/*
		Q5.WAP to create an SLL and apply following functions.
		-addatbeg()
		-addatend()
		-delatbeg()
		-delatend()
		-showList()
	*/

	public static void main(String args[])
	{
		SLL s = new SLL();
		
		s.create();
		s.show();
		s.addAtEnd(50);
		s.show();
		s.addAtBegin(10);
		s.show();
		out.println(s.deleteAtBegin());
		out.println(s.deleteAtEnd());
		
	
	}

}
