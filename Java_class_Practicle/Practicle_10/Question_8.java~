// find nth prime number

import java.util.*;

class Prime
{
	int n;
	
	
	public Prime(int n)
	{
	
		this.n=n;
	}
	
	boolean isPrime(int i)
	{
		for(int j=2;j*j<=i;j++)
		{
			if(i%j==0)
			{
				return false;		
			}
		}	
		
		return true;
	
	}
	
	
	
	int NthPrime()
	{
		int i  =2;
		int nt =0;
		int ans =i;
		while(nt<n)
		{
			if(isPrime(i))
			{
			
				nt++;
				ans=i;
				
			}
			i++;
		}
		
		return ans ;
	}
	
	
}



class Question_8
{
	public static void main(String[]args)
	{
		Prime p = new Prime(10);
		
		int pr  = p.NthPrime();
		
		System.out.println("10 th prime number = "+pr );
	}	
}
