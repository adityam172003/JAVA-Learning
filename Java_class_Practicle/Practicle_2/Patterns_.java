// pattern 1 ] 
class Pattern_1
{
	public static void main(String [] xyz)
	{
		int n = 5;
		
		for(int i =1 ;i<=5;i++)
		{
		
			for(int j = 5-i;j>=1;j--)
			{
				System.out.print('-');
			}
			
			for(int k =i ;k>=1;k--)
			{
			
				System.out.print(k);
			
			}
			
			for(int l=2; l<=i;l++)
			{
				System.out.print(l);
			
			}
			
			System.out.println();
			
		
		}
	
	
	}



}


// pattern 2 

class Pattern_2
{
	public static void main(String [] xyz)
	{
		int n = 5;
		
		for(int i =1 ;i<=5;i++)
		{
		
			for(int j = 5-i;j>=1;j--)
			{
				System.out.print('-');
			}
			
			for(int k =i ;k>=1;k--)
			{
			
				System.out.print('*');
			
			}
			
			for(int l=2; l<=i;l++)
			{
				System.out.print('*');
			
			}
			
			System.out.println();
			
		
		}
	
	
	}



}
