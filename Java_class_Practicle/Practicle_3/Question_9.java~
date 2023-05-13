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
	
	int getSum()
	{
		int ans=0;
		
		for(int x:num)
		{
			ans=ans+x;
		}
		
		return ans;
	}
	
	
}






class Question_8
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
			System.out.println(c.getSum());
		}
		
	}




}
