/*
	16.Define your own exception which will get thrown when user enters negative value as input.
Now keep scanning a number from user until user enters 0.Whenever user enters negative value,throw
exception of your class.At the end print addition of all positive integers.If addition is less than 50,
throw your own exception NotEnoughValueException.Print this exception with its type and reason.
*/

import java.util.*;

class  NotEnoughValueException extends Exception
{
	
	
}




class Question_16
{
	public static void main(String args[])
	{
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		int n=1;
		while(n!=0)
		{	
			System.out.println("Enter the number :");
			
			try
			{
				n = sc.nextInt();
					
				if(n<0)
				{
				 throw new Exception()
				 {
				 	public String toString()
				 	{
				 	  	String s = "Negative value , please enter +ve number";
				 	  	
				 	  	return s;	
				 	}
				 };
				}
				sum+=n;
			}
			catch(Exception w)
			{
				System.out.println(w);
			}
		}
		
		
		try
		{
			if(sum<50)
			{
				/*
				throw new Exception()
				{
					public String toString()
				 	{
				 	  	String s = "NotEnoughValueException";
				 	  	
				 	  	return s;	
				 	}	
				};
				*/
				
				 NotEnoughValueException e = new  NotEnoughValueException();
				 
				
				
				throw e;
			}
		}
		catch(Exception e)
		
		{
			System.out.println(e);
		}	
		
	}
}
