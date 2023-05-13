import java.util.*;

class Question_17
{
	public static void main(String [] xyz)
	{
		int [] num = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0;i<num.length;i++)
		{
			System.out.println("Enter the number ");
			num[i] = sc.nextInt();
		}
		for(int x : num)
		{
			System.out.println(x);
		}

	}
}
