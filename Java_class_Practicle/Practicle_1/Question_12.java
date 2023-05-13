import java.util.Scanner ;


class Question_12
{
	public static void main(String [] args)
	{
		/*
			Q 12 ] Keep scanning a character from user until user enters '?' . Print the count of 
			       capital and small alphabets.(using for loop)
		
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		char ch=' ' ;
		int capt = 0 ,small =0;
		while(ch!='?')
		{
		
			System.out.println("Enter the character");
			str = sc.next();
			ch  = str.charAt(0);
			if(ch=='?')break;
			if(((int)ch&(1<<5) )== 32 )
			{	
				capt++;
				
			}
			else
			{	
				small++;
			}
			
	
		}
		
		System.out.println("Capital letters = "+capt);
		System.out.println("Small letters   = "+small);
	
	}

}
