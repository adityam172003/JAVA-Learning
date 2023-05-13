import java.util.*;

class Array
{
	int arr[];
	
	public Array()
	{
		arr= new int[8];
		
	}
	
	void scan()
	{
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the elements in the array");
		
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
	}
	
	void removeDup()
	{
	
		for(int i =0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
				}
			}
		}
	
	}
	
	void print()
	{
	
		for(int x:arr)
		{
			System.out.print(x+"  " );
		}
		System.out.println();	
		
	}
	
	
	
	
}





class Question_19
{

	public static void main(String [] args)
	{
		Array a = new Array();
		
		a.scan();
		a.removeDup();
		a.print();
			
	}

}




