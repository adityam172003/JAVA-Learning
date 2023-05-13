import java.util.Scanner;


class Question_8
{
	/*	
		8.Scan a range from user.Print only even numbers in the range recursively in ascending order.


	*/
	public static void main(String []xyz)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int i =(a<b)?a:b;
		int j =(a<b)?b:a;
		Question_8.Solve(i ,j);
		System.out.println();
	
	}
	
	public static void Solve(int i ,int j)
	{
		if(i>j)
		{
			return;
		}
		
		if((i&1) == (int)0)
		{	
			System.out.print(i+" ");	
		}
		Question_8.Solve(i+1,j);
	}
	

}
