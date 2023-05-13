
class Myclass extends Throwable
{

	Myclass(String s)
	{
		super(s);
		
		
	}
	
	
	
}


class Question_8
{
	public static void main(String [] args)
	{
		try
		{
			try
			{
				Myclass M = new Myclass("THIS IS DANGERIOUS");
				throw(M);
			}
			catch(Myclass M)
			{
				System.out.println("Throwing the Exception from inner catch block");
				throw(M);
				// unreachable statement 
				//System.out.println("Throwing the Exception from inner catch block");
			}	
		}
		catch(Myclass m)
		{
			System.out.println("Catching inside outer catch block");
			System.out.println(m);
		}
	
	}
}
