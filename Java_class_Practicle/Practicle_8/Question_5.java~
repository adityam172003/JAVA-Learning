
/*
WAP to understand working of nested try catch.
*/

class Question_5
{
	public static void main(String [] args)
	{
		int arr[] = new int[5];
		
		
		try
		{
		
			try
			{
				
				System.out.println(arr[9]);
			}
			finally
			{
				System.out.println("Inside the finally of try nested try block");
			}
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
			
			System.out.println("Inside the outer catch block "+ a);	
		}
		
		
		
		try
		{
		
			try
			{
				System.out.println(arr[6]);
			}
			catch(ArrayIndexOutOfBoundsException q)
			{
				System.out.println("Inner catch block "+q);
			}	
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
			
			System.out.println("Inside the outer catch block "+ a);	
		}
		
		System.out.println("main ends");
	}
	
	
		
}
