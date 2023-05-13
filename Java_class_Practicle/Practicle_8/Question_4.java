

/*
WAP to understand working of try catch finally block.
*/


class Question_4
{
	public static void main(String args[])
	{
			
		// finally block will always get excuted 
		// there is exception or not dosn't matter  	
		try
		{
			//System.out.println(10/0);
			ArithmeticException ae = new ArithmeticException("adding 10");
			throw(ae);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			// it will create our own thread to get stackTrace so the input may be mixed
			e.printStackTrace();
		
		}
		finally
		{
		
			System.out.println("Inside the Finally block");
		}	
		
		
		// try without catch is not possible 
		// but try without catch with finally is possibble
		
		/*
			in this  case exception is handled by JVM and not by finally block
			
			Finally block will never handle the exceptions 
		*/
		
		try 
		{
			System.out.println("s ="+(10/0));
			
		}
		finally
		{
			System.out.println("Finally block with try ");
		
		}
		
		System.out.println("main ends");
	}
	
}
