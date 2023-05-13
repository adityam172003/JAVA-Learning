
import java.util.Scanner;
class Number
{
	private int num[];
	
	public Number()
	{
		num = new int[10];
		
	}
	public Number(int s)
	{
		num = new int[s];
	}
	
	
	public void scan_array()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the elements");
		
		for(int i = 0 ;i<num.length;i++)
		{
			num[i]  = sc.nextInt();
		}	
		

	}
	
	public void Sort()
	{	
	   // Insertion sort 	
		for(int i =1;i<num.length;i++)
		{
			int temp = num[i];
			int j = i-1;
			while(j>=0 && num[j]>temp)
			{
				num[j+1]= num[j];
				j--;
			}
			num[j+1]=temp;
			
		}
	
	}
	
	void print()
	{

		for(int i : num)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
}

class Question_6
{

	public static void main(String [] ars)
	{
	
		Number n = new Number(5);
		
		n.scan_array();
		n.print();
		n.Sort();
		n.print();
	
	}

}





























