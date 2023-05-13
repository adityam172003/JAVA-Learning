class Question_5
{
	/*
		5.For following main() function print 1 to 10 usnig recursion.

		p s v main(String ar[])
		{
			print(10);
		}
	*/
	public static void main(String [] xyz)
	{
		Question_5.Print(10);
		System.out.println();
	}
	
	public static void Print(int i )
	{
		if(i<=0)
		{
			return;
		}
		
		Question_5.Print(i-1);
		System.out.print(i+ " ");
	
	}


}
