import java.util.*;

class Question_12
{
	/*
		12.Create an array of 8 fraction values.Define function maxvalue() to find maximum value and define 
		function
                minvalue()  to find minimum value from array.
	*/
	public static void main(String[]xyz)
	{
		float [] num = new float[8];
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i= 0;i<num.length;i++)
		{	
			System.out.println("Enter the number ");
			num[i] = sc.nextFloat();
			
		}
		System.out.println("minimum of the array = " + Question_12.Min(num));
		System.out.println("maximum of the array = " + Question_12.Max(num));
	}
	
	static float Min(float [] num)
	{
		float n = num[0];
		
		for(int i =1;i<num.length;i++)
		{	
			if(num[i]<n)
			{
				n=num[i];
			}
		}
		
		return n;
	}
	
	static float Max(float [] num)
	{
		float n = num[0];
		
		for(int i =1;i<num.length;i++)
		{	
			if(num[i]>n)
			{
				n=num[i];
			}
		}
		
		return n;
	}
	
}
