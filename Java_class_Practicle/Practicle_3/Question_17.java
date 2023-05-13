import java.util.*;


class Number
{
	private int num[];
	
	Number()
	{
		num=new int[8];
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
	
	
	void deleteNum(int x)
	{	
		int i=0;
		for(;i<num.length;i++)
		{
			if(num[i]==x)
			{
				break;
			}
		}
		
		while(i<num.length-1)
		{
			num[i] = num[i+1];
		}
		num[i]=0; 
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






class Question_17
{
	public static void main(String [] args)
	{
		
		Number arr = new Number();
		
		arr.scan();
		arr.deleteNum(10);
		arr.print();
		
		System.out.println("The sum of arrays =");
		
		
		
		
	}




}
