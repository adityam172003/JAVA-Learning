import java.util.*;

class Array
{
	public int arr[];
	
	
	public Array()
	{
		arr=new int[8];
		
	}
	
	
	
	void scanArray()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers :");
		
		for(int i =0;i<arr.length;i++)
		{
		
			arr[i] = sc.nextInt();
		
		
		}
		
	}
	
	void  sort()
	{
		for(int i =0;i<arr.length;i++)
		{	
			int j=i-1;
			int temp = arr[i];
			while( j>=0 && arr[j] >temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	
	void print()
	{
	
		for(int c:arr)
		{
			System.out.print(c);
		}
		System.out.println();
	
	}
	


}


class Question_23
{




	public static void main(String [] args)
	{


		Array  a = new Array();
		
		a.scanArray();
		a.sort();
		a.print();
		


	}




}



