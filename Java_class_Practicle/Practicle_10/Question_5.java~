//5.Create a jagged array and find row-wise addition.

import java.util.Scanner;

class JaggedArray
{
	int arr[][];
	
	public void scan()
	{
		int r;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		
		r   = sc.nextInt();
		arr = new int[r][]; 
		for(int i =0;i<r;i++)
		{
			System.out.println("Enter the column number");
			c = sc.nextInt();
			arr[i] = new int[c];
			
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter the element :");
				arr[i][j] = sc.nextInt();
				
			}
			
		}
		
	}
	
	public void getSum()
	{
		for(int i =0;i<arr.length;i++)
		{
			int s =0;
			for(int j=0;j<arr[i].length;j++)
			{
				s+=arr[i][j];
				
			}
			System.out.println("sum of the "+i+" row = "+s);
		}
	}	
}


class Question_5
{
	public static void main(String [] args)
	{
		JaggedArray a = new JaggedArray();
		
		a.scan();
		a.getSum();
	}
}
