import java.util.Scanner;

import static java.lang.System.out;




class Question_2
{
	/*
		2.WAP to understand capacity(),ensureCapacity() and setLength() functions of StringBuffer object
	
	*/
	public static void main(String [] args)
	{
	
			
			StringBuffer sb = new StringBuffer();
			// capacity 
			
			int cap = sb.capacity();  // default capacity ==16 
			
			System.out.println("Capacity = "+cap);	
			
		 	StringBuffer sb2 = new StringBuffer("aditya");
		 	
		 	System.out.println(sb2.capacity()); // ourString+16 = total capacity == 22;
		 	
		 	
		 	
			// ensureCapacity
			
			StringBuffer sb3 = new StringBuffer();
			
			sb3.ensureCapacity(10);   // we cant decrease the capacity 
			
			out.println("Capacity sb3 = "+sb3.capacity());
			
			sb3.ensureCapacity(40);
			// little doubt in ensure capacity 
			out.println("Capacity sb3 = "+sb3.capacity()); // we can only increase the capacity
			
			sb2.ensureCapacity(24);
			System.out.println(sb2.capacity());
			
			System.out.println("Length sb2 = "+sb2.length());
			
			System.out.println("Length sb2 = "+sb2.length());
			sb2.setLength(7);	
			out.println(sb2);
			
			sb2.setLength(3);
			out.println(sb2);
					
			
				
	}


}
