import java.util.*;


class Array
{
	public int arr[][];
	
	int row;
	int col;
	
	public Array()
	{
		arr=null;
		
	}
	
	
	
	void scanArray()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row number in array : ");	
		row        = sc.nextInt();
		System.out.println("Enter the col number in array : ");
		col        = sc.nextInt();
		arr        = new int[row][col];
		for(int x[] :arr)
		{	
			for(int i =0;i<x.length;i++)
			{
				x[i] = sc.nextInt();
			}
		}
		
	}
	
	int[] sum()
	{
		int ans[];
		int i =0;
		ans = new int[arr.length];
		for(int x[] :arr)
		{	int s =0;
			for(int y :x)
			{
				s=s+y;
			}
			
			ans[i]=s;
			i++;
		}
		
		return ans;
	}


}


class Question_22
{
	public static void main(String args[])
	{
		Array  ar = new Array();
		ar.scanArray();
		int sumArray[];
		
		sumArray  = ar.sum();
		
		for(int c :sumArray)
		{

			System.out.print(c + " ");
			 
		}
		System.out.println();

	
	
	
	}



}



