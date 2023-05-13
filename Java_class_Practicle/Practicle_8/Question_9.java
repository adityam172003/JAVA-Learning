
import java.util.*;


class InputException extends Exception
{
	InputException(String s)
	{
		super(s);
	}
}





class Question_9
{

	public static void main(String args[])
	{
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		int i =0;
		/*
		while(i<arr.length)
		{
			try
			{	try
				{
				
					System.out.println("Enter the number");
					arr[i] = sc.nextInt();
					
					i++;
				}
				catch(Exception a)
				{
					InputException ae = new InputException("Invalid number ");
					throw(ae);
				}
			}
			catch(InputException ae)
			{
			
				System.out.println(ae);
				
			}
			
		}	
		
		*/
		
		while(i<arr.length)
		{
		
			try
			{
				
				System.out.println("Enter the number");
				arr[i] = sc.nextInt();
				i++;	
					
			
			}
			catch(InputMismatchException ae)
			{	
				// we have to clean the buffer 
				sc.nextLine();
				System.out.println(ae);
				
			}
			
			
			
		}
		
		for(int  p:arr)
		{
			System.out.println(p);
		}
			
			
	}
	

}


