import java.util.*;

import static java.lang.System.out;

class Node
{

	char data ;
	
	Node next;
	
	public Node()
	{
		next=null;
		
	
	}
	
	public Node(char ch )
	{
		data = ch;
		next    = null;
	}

}



class SLL
{	
	
	Node head;
	
	public SLL()
	{
		head = null;
	
	}
	
	void insert(char ch)
	{
		out.println("=="+ch);
		if(head==null)
		{
			head = new Node(ch);
			return;
		}
		
		Node p =head;
		
		while(p.next!=null)
		{
			p=p.next;
		}
		
		p.next=new Node(ch);
	}
	
	
	void show()
	{
	
		Node p = head;
		
		while(p!=null)
		{
			out.print(p.data+" -->");
			p=p.next;
		}
		out.println();
	}
	
	
	
	void convertToList(String s)
	{
	    
	    
	   // out.println((ind & (1<<5)));
	   
	   int arr[] = new int[26];
	   
	   for(int i =0;i<s.length();i++)
	   {	
	   	int index;
	   	
	   	char ch = s.charAt(i);
	    	int ind = (int)ch;
	    	
	   	if((ind & (1<<5)) ==0)
	    	{
	    
	    		index = (ind-(int)'A');
	    	}
	    	else
	    	{
	    
	    		index =(ind-(int)'a');
	    	}
	    	//out.println(index);
	    	
	    		arr[index]=ind;
	    	
	    	
	   
	   }
	   
	   for(int i =0;i<26;i++)
	   {
	   	//out.println(arr[i]);
	   	if(arr[i]!=0)
	   	{
	   		
	   		insert((char)arr[i]);
	   	}
	   
	   }
	   
	   
	
	    
		
	}
	
	
}



class Question_3
{
	
	public static void main(String args[])
	{
		SLL l1 = new SLL();
		
		out.println("Enter the string ");
		String s;
		
		Scanner sc = new Scanner(System.in);
		
		s = sc.nextLine();
		
		l1.convertToList(s);
		l1.show();
		
	
	}

}
