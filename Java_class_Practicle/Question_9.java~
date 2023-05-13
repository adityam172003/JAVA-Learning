import java.util.*;

class Question_9
{
	public static void main(String args[])
	{
		/*
		    Q 9 ]  WAP to check if given number is pallindrome or not.(while)
		    
		    reverse the number and check if equal or not 
		*/
		
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		n = sc.nextInt();
		
		int a = n;
		int ans = 0;
		int d =1;
		while(a>0)
		{
			
			d=d*10;
			a=a/10;
		}
		a=n;
		d=d/10;
		while(a>0)
		{
			int n1 = a%10;
			    a  = a/10;
			    ans = ans + n1*d;
			    d=d/10;
		
		}
		
		if(ans == n)
		{
			System.out.println(n+ " is palindrom number");
		}
		else
		{
			System.out.println(n+ " is no a palindrom number ");
		}
		
		
	}




}
