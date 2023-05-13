

import java.util.Scanner;
class Question_8
{

	public static void main(String [] ags)
	{
		Teacher  tcr[];
		tcr = new Teacher[6];
		
		
		for(int i =0;i<tcr.length;i++)
		{
			tcr[i] = new Teacher();
			tcr[i].addT();
			
		}
		
		// teachers having age greater than 50
		
		for(Teacher i : tcr)
		{
			if(i.ageT(2023)>=50)
			{
				i.showT();
				System.out.println("=======================");
			
			}
		
		}
		
		System.out.println("Enter the character");
		Scanner sc = new Scanner(System.in);
		
		String str;
		str    = sc.next();
		char c = str.charAt(0);
		
		System.out.println("Teachers whose name start whith character "+ c);
		for(Teacher i : tcr)
		{
			if(i.checkT(0,c));
			{
				i.showT();
				System.out.println("=======================");
			
			}
		
		}
		
		
		for(int i =0;i<tcr.length;i++)
		{
			if(tcr[i].ageT(2023)==35)
			{
				tcr[i]=null;
			
			}
		
		}
		
		System.out.println("teachers whose age is not equal to 35");
		for(Teacher i : tcr)
		{
			if(i!=null)
			{
				i.showT();
				System.out.println("=======================");
			
			}
		
		}
		
	}


}
