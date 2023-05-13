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
	
	int getMax()
	{
		int ans=num[0];
		
		for(int x:num)
		{
			if(x>ans)
			{
				
				ans=x;
				
			}
		}
		
		return ans;
	}
	
	
}






class Question_18
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
		int m = arr[0].getMax();
		int s=0;
		for(int i =0;i<arr.length;i++)
		{	
			int an =arr[i].getMax();
			if(m<an)
			{	s=m;
				m = an;
			}
		}
		
		System.out.println("Max number = "+s);
		
	}




}
