import java.util.*;


class Number
{
	private int num[];
	
	Number()
	{
		num=new int[5];
	}
	
	void scan()
	{
		System.out.println("Enter the number");
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<num.length;i++)
		{
			num[i] = sc.nextInt();
		}
	}
	
	void sort()
	{	
		
		for(int i =1;i<num.length;i++)
		{
			int j   = i-1;
			int tem = num[i];
			
			while(j>=0 &  num[j]>tem)
			{
				num[j+1]=num[j];
				j--;
			} 
			num[j+1]=tem;
		}
		
		
	}
	
	
	void print()
	{
		for(int a : num)
		{
			System.out.print(a+ " " );
			
		}
		System.out.println();
	}
	
	
}






class Question_16
{
	public static void main(String [] args)
	{
		
		Number arr[] = new Number[3];
		
		for(int i=0;i<arr.length;i++)
		{

			arr[i] = new Number();
			
			arr[i].scan();
			
			
		}
		
		
		System.out.println("The sum of arrays =");
		
		for(Number c :arr)
		{	
			c.sort();
			c.print();
		}
		
		
	}




}
