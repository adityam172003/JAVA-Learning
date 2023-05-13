import java.util.Scanner;


class Question_4
{
	public static void main(String [] args)
	{
		/*
			Q 4 ] Scan a number from user.Find addition of it's digits.
		
		*/
		
		
		int x;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number ");
		x = sc.nextInt();
		
		int ans = 0;
		while(x>0)
		{
			ans = ans+(x%10);
			x   = x/10;
		}
		
		System.out.println("Sum of the Digits is = "+ ans);
				

	}



}
