import java.util.Scanner ;


class Question_6
{
	public static void main(String [] xyz)
	{
		/*
			Q 6 ] Scan a number from user.Check if it is prime or not.

		*/
	
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		n  = sc.nextInt();
		
		boolean flag=false;
		
		for(int i = 2 ; i*i <= n ;i++ )
		{
			if(n%i==0) flag = true;
		} 
		
		if(flag)
		{
		 	System.out.println(n + " is not a prime number ");
		}
		else
		{
			System.out.println(n + " is a prime number ");
		}
	}



}
