import java.util.*;



import static  java.lang.System.out;



class Word
{
	String key;
	
	String m1;
	String m2;
	
	
	
	
	public Word()
	{
		key   = new String();
		m1    = new String(); 
		m2    = new String();
		
	}
	
	public Word(String key,String m1,String m2)
	{
		this.key   = key;
		this.m1    = m1;
		this.m2    = m2;
			
	}
	
	
	void Update(String m1,String m2)
	{
		this.m1 = m1;
		this.m2 = m2;
		

	}
	
	void show()
	{
		out.println("Key         = " + key);
		out.println("Meaning 1   = " + m1);
		out.println("Meaning 2   = " + m2);
	

	}
	
	int getWord()
	{	
		out.println("Enter the Key");
		Scanner sc = new Scanner(System.in);
		
		key        = sc.nextLine();
		
		if(key.equalsIgnoreCase("stop"))
		{
			return (int)0;
		}
		
		
		out.println("Enter the meaning 1 ");
		m1         = new String();
		m1         = sc.nextLine();
		
		out.println("Enter the meaning 2 ");
		m2	   = new String();
		m2         = sc.nextLine();
		
		return (int)1;
		
	}
	
	
}


class Node
{
	public Word w;
	public Node next ;
	
	
	public Node()
	{
		w= null;
		next =null;
	}
	public Node(Word w)
	{
		this.w = w;
		next   = null;
	}
	
}


class SLL
{

	Node head;
	
	public SLL()
	{
		head =null;
	}
	
	
	
	void addAtEnd(Word d)
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
	
	
	void show()
	{
		if(head==null)
		{
			out.println("List is empty");
		
			return;

		}
		out.println("=======================================");
		
		Node p =head;
		
		while(p!=null)
		{
			p.w.show();
			out.println("------------------------------");
			p=p.next;
		}
		out.println();	
	
	}
	
	void create()
	{
		Scanner sc = new Scanner(System.in);
		out.println("keep enterign the data to stop enter key = stop");
		
		while(true)
		{	
			out.println(":");
			Word d = new Word();
			int res = d.getWord();
			
			if(res==0)
			{
				return;
			}
			
			addAtEnd(d);
		}	
		
			
			
	}
	
	Word search(String k)
	{
	
		
		
		Node p = head;
		while(p!=null&& p.w.key.equalsIgnoreCase(k)!=true)
		{
		
			p=p.next;
		}
		
		return p;
	}
	
	void updateManing()
	{
		Scanner sc = new Scanner(System.in);
		
		string a,b,c;
		
		out.println("Enter the Key");
		
		a = sc.next();
		
		Node p =search(a);
		
		if(p!=null)
		{
			
		}
		
		
	
	}
	




}

class Question_6
{	
	/*
		6 . WAP to create a dictionary which contains words and their meanings.
		Single word may have maximum 2 meanings.Meaning of word can be updated or deleted.
		A word also can be updated or deleted.(Use sll to create it).
	*/


	public static void main(String args[])
	{
			SLL s1 = new SLL();
			
			s1.create();
			s1.show();
			
		
	}

}
