


class Question_10
{
	public static void main(String args[]) throws Throwable
	{
		// exceptions which can not be handled by jvm 
		// we have to make jvm ready to handle them
		
		// throwable ,InterruptedException,Exception
		
		
		// unreported exception we have to report it
		int x=0;
		
		if(x==0	)
		{
		
		InterruptedException e = new InterruptedException("checked Exception");
		throw e;
		
		
		}
		
		
		
		
		
		
		
		System.out.println("Main Ends");
	
	}
}
