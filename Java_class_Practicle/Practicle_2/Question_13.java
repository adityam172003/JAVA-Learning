import java.util.*;

class Question_13
{	
	/* 13.Scan an array of 8 characters from user.Count only capital alphabets in array.
	*/
	public static void main(String [] xyz)
	{
		Scanner sc = new Scanner(System.in);
		char [] ch = new char[8];
		String str;
		for(int i =0;i<ch.length;i++)
		{
			System.out.println("Enter the character ");
			str = sc.nextLine();
			ch[i] = str.charAt(0);
			
		}
		int ans = 0;
		for(char x :ch)
		{
			if( x >='A' && x<='Z')
			{
				ans++;
			}
		}
		System.out.println("Capital alfabates = "+ ans);
		
	}

}
