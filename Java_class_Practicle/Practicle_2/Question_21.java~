import java.util.*;


class Array
{
	public int arr[][];
	
	public Array()
	{
		arr = new int[5][4];
		
	}
	
	void scanArray()
	{
		Scanner sc = new Scanner(System.in);
		for(int x[] :arr)
		{	
			for(int i =0;i<x.length;i++)
			{
				x[i] = sc.nextInt();
			}
		}
		
	}
	
	int count(int n)
	{
		int ans=0;
		for(int x[]:arr)
		{

			for(int y : x)
			{
				if(y==n)ans++;
			}
		}
		
		return ans;
	}





}

class Question_21
{

	public static void main(String args[])
	{
		Array ar = new Array();
		
		ar.scanArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("Count of the number "+n+" ="+ar.count(n));
		
	
	
	
	}








}


