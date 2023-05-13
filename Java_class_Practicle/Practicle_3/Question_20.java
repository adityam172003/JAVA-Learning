import java.util.*;

class JaggedArrya
{
	int num[][];
	
	public JaggedArrya()
	{
		num=null;
		
	}
	
	void scan()
	{
		System.out.println("Enter the number of rows :");
		int row;
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		num = new int[row][];
		
		for(int i =0;i<row;i++)
		{
			System.out.println("Enter the number of columns :");
			int col;
			col = sc.nextInt();
			num[i] = new int[col];
			System.out.println("Enter the elemets ");
			
			for(int j=0; j<col;j++)
			{
				System.out.print(":");
				num[i][j] = sc.nextInt();	
			
			}
		
		}
		
		
	}
	
	
	int[] getSum()
	{
		int sum[] = new int[num.length];
		int i=0;
		for(int[]x:num)
		{	
			int s=0;
			for(int y:x)
			{
				s=s+y;
			}
			sum[i]=s;
			i++;
		}
		
		return sum;
	}

}





class Question_20
{

	public static void main(String args[])
	{
		JaggedArrya ja = new JaggedArrya();
		
		ja.scan();
		int arr[];
		arr = ja.getSum();
		
		for(int a:arr)
		{
			System.out.println(a);
		}
		
	
	}


}










