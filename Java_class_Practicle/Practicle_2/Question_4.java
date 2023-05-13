class Question_4
{
	/*
		4.WAP to print 1 to 10 recursively.
	*/
	public static void main(String [] xyz)
	{
		
		Question_4.Solve(1);
		System.out.println();
	
	}
	
	public static void Solve(int i)
	{
		if(i==11)
		{
			return;
		}
		
		System.out.print(i+ " ");
		Question_4.Solve(i+1);
	}

}
