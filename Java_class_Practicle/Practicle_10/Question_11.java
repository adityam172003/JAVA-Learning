/*
11.WAP to find n th prime number.Try to find 3 prime numbers for different values of n
using mainthread only.Note the total time required.
*/


// find nth prime number

import java.util.*;

class Prime implements Runnable
{
	int n;
	
	
	public Prime(int n)
	{
	
		this.n=n;
	}
	
	
	public void run()
	{
		NthPrime();
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
	
	
	
	public void NthPrime()
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
		
		System.out.println(ans);
	}
	
	
}



class Question_11
{
	public static void main(String[]args)
	{
		Prime p1  = new Prime(10000);
		Prime p2  = new Prime(20000);
		Prime p3  = new Prime(30000);
		
	
		p1.NthPrime();	
		p2.NthPrime();
		p3.NthPrime();	
	}	
}
