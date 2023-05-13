import java.util.*;

class Question_8
{
	public static void main(String arge [])
	{
		/*
			Q 8 ] WAP to print nth prime number.
		*/
		
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		n = sc.nextInt();
		int prime = 2;
		int nth = n;
		int ans = 2;
		while(n>0)
		{
			boolean flag = true;
			for(int i =2 ; i*i<=prime ; i++)
			{
				if(prime % i ==0 ) flag = false;
			
			}
			
			if(flag)
			{
				ans = prime;
				n--;
			}
			prime++;
		}
		System.out.println(nth +"th prime number is = "+ans);
		
		
	}
	
	
	
	




}
