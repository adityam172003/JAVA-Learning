import java.util.*;

class Array
{
	public int arr[][];
	
	public Array()
	{
		arr = new int[5][];
		System.out.println("Enter the numbers ");
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = new int[3];
		}
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
	
	void lengthPro()
	{
		System.out.println("lenght of main array : arr.length = "+ arr.length); // 5
		
		for(int x[] :arr)
		{
			System.out.println("Length of sub arrays x.length = "+x.length);
			for(int y : x)
			{
				System.out.println(y);
			}
		}
	}





}






class Question_20
{



	public static void main(String [] args)
	{
		Array a = new Array();
		
		a.scanArray();
		a.lengthPro();
	}	





}












