import java.util.*;

class Question_2
{
	/*
		2.Scan 6 characters from user.Define function tolower() to convert all
		 characters to uppercase if they are in lowercase.
	*/
	
	static void toLower(char [] arr)
	{
		
		for(int i =0;i<arr.length;i++)
		{
			arr[i] =(char)(((int)arr[i] ) & ~(1<<5));
		
		}
		
		
		
	}
	public static void main(String args[])
	{
		
		char []arr = new char[6];
		Scanner sc = new Scanner(System.in);
		String str;
		Sytem.out.println("Enter the charactors in the array");
			
		for(int i =0;i<arr.length;i++)
		{
			str   = sc.next();
			arr[i]= str.charAt(0);
			 
		}
		
		for(char c  : arr)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		
		
		Question_2.toLower(arr);
		
		for(char c  : arr)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		
	}




}
