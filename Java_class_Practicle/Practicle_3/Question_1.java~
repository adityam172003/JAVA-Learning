import java.util.Scanner;

class Queation_1
{
	/*
		1.WAP to scan 8 integers from user in an array.
		Sort these elements using bubble sort.
	*/
	
	public static void main(String []xyz)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		int arr[] =new int[8];
		System.out.println("Enter the numbers in the array");
		
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		for(int i =1;i<arr.length;i++)
		{
			for(int j =0;j<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]   =arr[j+1];
					arr[j+1] =temp;
			        }	
		        }

	        }
	        
	        for(int x:arr)
		{
			System.out.print(x+" ");
		}	
		System.out.println();
	        
	}
}
