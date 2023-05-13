import java.util.*;


class Array
{
	public int arr[][];
	
	int row;
	
	
	public Array()
	{
		arr=null;
		
	}
	
	
	
	void scanArray()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row number in array : ");	
		row        = sc.nextInt();
		
		arr        = new int[row][];
		for(int j = 0;j<arr.length;j++)
		{
			System.out.println("Enter the col number in array : ");
			int col        = sc.nextInt();
			arr[j] = new int[col];
			System.out.println("Enter the  numbers in array : ");
			for(int i =0;i<arr[j].length;i++)
			{
				arr[j][i] = sc.nextInt();
			}
		}
		
	}
	
	void sum()
	{
		
		
		
		for(int x[] :arr)
		{	int s =0;
			for(int y :x)
			{
				s=s+y;
			}
			
			System.out.println(s);
		}
		
		
	}


}



class Question_24
{

	public static void main(String args[])
	{

		Array a = new Array();
		a.scanArray();
		a.sum();


	}







}
