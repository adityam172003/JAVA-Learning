/*
class Number
{
	int array[];
}
Create array of 3 objects of class number.Each object contains an array of n integers where n is the input from 
user.
Scan data for all the objects of class Number.While entering data user may give wrong input.(Here wrong input can 
be 
an alphanumeric string)Handle this situation using exception handling.Once input process is complete,find the 
largest
integer among all the objects.
*/


import java.util.*;

class Number 
{
	int num[];
	
	public void scan()
	{
		Scanner sc = new Scanner(System.in);
		
		int r ;
		System.out.println("Enter the number of rows");
		r   = sc.nextInt();
		num = new int[r];
		int i=0;
		while(i<r)
		{
			System.out.println("Enter the numbers :");
			try
			{
				num[i]=sc.nextInt();
				i++;
			
			}
			catch(Exception e)
			{
				
				System.out.println("Please enter the valid number "+e);
				
			}
		}
		
		
	}
	
	int getMax()
	{
	
		int ans = num[0];
		for(int i =1;i<num.length;i++)
		{
			if(ans<num[i])
			{
				ans = num[i];
			}
		}
		return ans;
	}

}


class Question_6
{
	public static void main(String [] args)
	{
		Number arr[]  = new Number [3];
		
		for(int i =0;i<arr.length;i++)
		{
			arr[i]=new Number();
			arr[i].scan();
				
		}	
		
		
		int ans = arr[0].getMax();
		for(int i =1;i<arr.length;i++)
		{	
			int max = arr[i].getMax();
			if(ans<max)
			{
				ans=max;
			}
		}
		
		System.out.println("Max number = "+ans);
		
				
	}
}
