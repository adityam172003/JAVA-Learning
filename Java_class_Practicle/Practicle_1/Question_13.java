class Question_13
{
	
	public static void main(String [] args)
	{
	
	
		// pattern 1 
		System.out.println("pattern 1");
		
		for(int i =1;i<=5;i++)
		{
		
			for(int j =1 ;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		
		}
		
		
		// pattern 2 
		System.out.println("pattern 2 ");
		
		
		for(int i =5;i>0;i--)
		{
		
			for(int j =1 ;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		
		}
		
	
		// pattern 3 
		System.out.println("pattern 3");
		
		for(int i =1;i<=5;i++)
		{
		
			for(int j =1 ;j<=6-i;j++)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
		
		}
		
		// pattern 4 
		System.out.println("pattern 4");
		
		for(int i =1;i<=5;i++)
		{
		
			for(int j =i ;j<=5;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		
		}
		
	
		// pattern 5 
		System.out.println("pattern 5");
		
		for(int i =5;i>0;i--)
		{
		
			for(int j =1 ;j<=i;j++)
			{
				System.out.print(i+ " ");
			}
			System.out.println();
		
		}
	
		// pattern 6 
		System.out.println("pattern 6");
		
		for(int i =5;i>0;i--)
		{
		
			for(int j =i ;j>0;j--)
			{
				System.out.print((char)(64+j) + " ");
			}
			System.out.println();
		
		}
		
		
		
		// pattern 7
		System.out.println("pattern 7");
		
		for(int i =1;i<=6;i++)
		{
		
			for(int j =1 ;j<=6-i;j++)
			{
				System.out.print("_");
			}
			
			for(int k = 1 ; k<=i;k++)
			{
				System.out.print(k+ "");
			}
			System.out.println();
			
		
		}
		
		
		
		// pattern 8
		System.out.println("pattern 8");
		
		for(int i =1;i<=6;i++)
		{
		
			for(int j =1 ;j<=6-i;j++)
			{
				System.out.print("_"+" ");
			}
			
			for(int k = 1 ; k<=i;k++)
			{
				System.out.print(k+ " ");
			}
			for(int l = i-1 ;l>=1;l--)
			{
				System.out.print(l+ " ");
			}
			System.out.println();
			
		
		}
	
	
	
		// pattern 10
		
		
		// pattern 8
		System.out.println("pattern 10");
		
		for(int i =1;i<=6;i++)
		{
		
			for(int j =6 ;j>=i;j--)
			{
				System.out.print(j);
			}
			
			for(int k = 1 ; k<=i-1;k++)
			{
				System.out.print("_");
			}
			for(int k = 1 ; k<=i-1;k++)
			{
				System.out.print("_");
			}
			for(int l = i ;l<=6;l++)
			{
				System.out.print(l);
			}
			System.out.println();
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}














}
