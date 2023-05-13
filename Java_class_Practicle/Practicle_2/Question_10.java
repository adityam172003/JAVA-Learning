import java.util.*;

class Question_10
{
	public static void main(String[]xyz)
	{
	
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		n=sc.nextInt();
		
		int ans =0;
		while(n>0)
		{
			ans = ans+(int)(n%10);
			n=(int)n/10;
			
		}
		System.out.println("Sum of all the digits of the enterd number = "+ans);
		
	}

}
