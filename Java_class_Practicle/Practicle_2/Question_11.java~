import java.util.*;

class Question_11
{
	/*
		11.Scan array of 5 integers from user.But while scanning a number from user,make sure that it is a 
		prime number.
                If it is not a prime number,do not accespt that number.Ask user to enter a number again.Once he 
                gives 
                5 primes,
		print all the numbers.Make your code modular.(means use function).
	*/
	public static void main(String []xyz)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		int [] num = new int[5];
		int i =0;
		while(i<5)
		{
			System.out.println("Enter the prime number ");
			n =sc.nextInt();
			if(Question_11.Prime(n))
			{
				num[i] =n;
				i++;
			}
			else
			{
				System.out.println(n+ " is not prime number");
			}
		}
		
		for(int x : num)
		{	
			System.out.print(x+" ");
		}	
		System.out.println();
		
		
		
	}
	
	public static boolean Prime(int n)
	{
		for(int i =2;(i*i)<=n;i++)
		{
			if((n%i)==(int)0)
			{	
				return false;
			}
		}
		return true;
	}

}
