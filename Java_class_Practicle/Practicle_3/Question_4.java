import java.util.*;



class Number
{
	public static int x;
	public        int y;
	
	//  static block
	
	
	static
	{
		System.out.println("Inside the static block");
		x=10;
		System.out.println("x= " + x);
		
	
	}
	
	
	// anonymous block
	{
		System.out.println("Inside the anonymous block");
		x=20;
		System.out.println("x= " + x);
			
	}
	
	
		
		
		
}
	

class Question_4
{
	
	/*
		4.WAP to explain static members.Try all the rules we have seen.
	*/
	
	
	public static void main(String [] args)
	{
		
		System.out.println("Static data members");
		Number n;
		n = new Number();
		
		Number.x=30;
		
		System.out.println("inside main function x = "+Number.x);
		Number n1 =new Number();
		Number n2 =new Number();
		
		
		System.out.println("Accessing static usign n1 :" + n1.x);
		
		System.out.println("Accessing static usign n2 :" + n2.x);
		
		
	}
	
}
