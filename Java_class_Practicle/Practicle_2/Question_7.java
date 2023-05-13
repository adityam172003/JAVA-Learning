import java.util.Scanner ;

class Question_7
{
	/*
		7.Scan a range from user.Print all the integers in the range in ascending order recursively.
	*/
	public static void main(String [] args)
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int i =(a<b)?a:b;
		int j =(a<b)?b:a;
		Question_7.Solve(i ,j);
		System.out.println();
	
	
	}
	
	public static void Solve(int i ,int j)
	{
		if(i>j)
		{
			return;
		}
		
		System.out.print(i+" ");
		Question_7.Solve(i+1,j);
	}
	
}
