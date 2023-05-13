import java.util.*;

class Question_14
{	
        /*
        	14.Scan a number from user.Print addition of digits recursively
        */
	public static void main(String []p)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number ");
		n = sc.nextInt();
		
		System.out.println("sum of digits =" +Question_14.Solve(n));
	}
	
	static int Solve(int n)
	{
		if(n==0)
		{
			return 0;
		}
		
		int ans = Question_14.Solve(n/10) +(n%10);
		
		return ans;
	}
	

}
