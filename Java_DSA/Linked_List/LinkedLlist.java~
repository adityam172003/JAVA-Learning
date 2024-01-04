import java.util.*;

class Node
{
	
	private int data;
	public Node next;
	
	public Node()
	{
		data =0;
		next =null;
	}
	
	public Node(int d)
	{
		this.data = d;
		next =null;
	}
	
	public int getd()
	{
		return data;
	}
	
	
}


// singly linked list 
class SLL
{
	private Node head;
			
	private int total_nodes;
	
	public SLL()
	{
		head = null;
		total_nodes=0;
	}
	
	
	//  insert last_   Iterative
	
	public void insertAtLast(int d)
	{
		
		if(head==null)
		{
			head= new Node(d);
			return;
		}
		Node p = head;
		while(p.next !=null)
		{
			p=p.next;
		}		
		total_nodes++;
		p.next = new Node(d);
		
		return;
	}
	//-----------------------------------------------------------------------------
	// insert at last recursive
	
	public Node insertR(Node p ,int d)
	{
		if(p==null)
		{
			total_nodes++;
			return new Node(d);
		}
  		p.next= insertR(p.next,d);	
		return p;
	}
	

	public void insertLastRecursive(int d)
	{
		head= insertR(head,d);
		
	}	
	
	//-----------------------------------------------------------------------------
	
	// create the linked list
	
	public void create()
	{
		Scanner sc = new Scanner(System.in);
		
		String str =null;
		while(!str.equals("stop"))
		{
			System.out.println("Enter the number to insert (to stop enter 'stop'): ");
			str = sc.next();
			str.toLowerCase();
			try
			{
				int d = Integer.parseInt(str);
				
				this.insertAtLast(d);
			}	
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("Please enter the correct numebr");
			}
		}   
		
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	
	// insert at begining
	
	public void insertAtBegin(int d)
	{
		if(head ==null)
		{
			head = new Node(d);
			return;
		}
		
		Node q = new Node(d);
		
		q.next =head;
		head =q;
		total_nodes++;
	}
	
	// insert at index 
	// this function returns true if data inserted successfully 
	// return false if index is invalid 
	
	// contains the 0 based indexing
	public void insertAt(int index ,int d) throws Exception
	{           
                                       final int dd= index;
		if(index > total_nodes)
		{
			throw new Exception()
			{
				public String toString()
				{
					return "Invalid Index  : "+ dd+" Greater than : "+total_nodes;
				}
			};
		}
		
		
		Node p = head;
		
		if(index == 0)
		{
			this.insertAtBegin(d);
			
			return;
		}
		
		if(index==total_nodes-1)
		{
			this.insertAtLast(d);
			return;
		}
		
		
		while(index>1)
		{
			p=p.next;
			index--;
		}
		
		
		Node nxt = p.next;
		
		Node temp = new Node(d);
		
		p.next = temp;
		temp.next = nxt;
		
		return;	
	

	}

	
	
//------------------------------------------------------------------------------------------------------------



// delete at begining 

	public Integer deleteAtBegin()
	{
	
		if(head==null)
		{
			return  null;
			
		}
		
		
		Node p =head;
		
		head = head.next;
		
		return p.getd();		
			
	}

// ------------------------------------------------------------------------------------------------------------------

// delete at end 


	public Integer deleteAtEnd()
	{
		if(head==null)
		{
			return null;
		}		
		
		
		Node p =head;
		Node q=null;
		while(p.next !=null)
		{
			q=p;
			p=p.next;
		}
		
		q.next =null;
		
		return p.getd();
		
	
	}

// ---------------------------------------------------------------------------------------


// delete at index 
	
	// zero based indexing 
	public Integer deleteAt( final int index ) throws Exception
	{	
		if(index > total_nodes)
		{
			throw new Exception()
			{
				public String toString()
				{
					return "Invalid Index  : "+index+" Greater than : "+total_nodes;
				}
			};
		
			
		}
		
		if(index==0)
		{
			return this.deleteAtBegin();
			
		}
		
		if(index==total_nodes-1)
		{
			return this.deleteAtEnd();
		}		
		
		Node p =head;
		Node q=null;
                                      int d =index;
		while(d>1)
		{
			q=p;
			p=p.next;
			d--;
                        
		}
		
		q.next =p.next;
		return p.getd();
		
	
	}	
	
// ------------------------------------------------------------------------------

// display

	public String display()
	{	
		if(head==null)
		{
			System.out.println("Empty ");
			return "[]";
		}
		
		
		Node p =head;
		String ans="";
		while(p !=null)
		{
			ans +=p.getd();
			p=p.next;
		}
		return "["+ans+"]";
	
	}	
	
	public String toString()
	{
		return this.display();
	}
	
	
	public int valueAt(int index) throws Exception
	{             
		if(index>total_nodes)
		{
			throw new Exception()
			{
				public String toString()
				{
					return "Invalid Index  : "+ index+" Greater than : "+total_nodes;
				}
			};
			
			
		}
		
		
		Node p = head;
		
		
		while(index >0)
		{
			p=p.next;
		}
		
		return p.getd();
	}
	
// ---------------------------------------------------------------------------------------------------------------------------------------------

	

}


