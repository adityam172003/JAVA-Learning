import java.util.Scanner;




class Mystring
{
	public StringBuffer sb;
	
	
	void scanString()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String s  = sc.nextLine();
		sb = new StringBuffer(s);
	}
	
	
	void ulter()
	{
		for(int i =0;i<sb.length();i++)
		{
			int ch = (int)sb.charAt(i);
		
			char ch1 = (char)(ch^((1<<5)));
			
			sb.setCharAt(i,ch1);
		
		}
			
		System.out.println(sb);
	}

}


class Question_1
{
	/*
		Q1.Scan a String from user.Replace every uppercase alphabet by is lowercase version and
		replace every lowercase alphabet by its uppercase version.Use StringBuffer class to store String 
		from user.
	*/
	
	public static void main(String [] args)
	{
		Mystring s = new Mystring();
		
		s.scanString();
		s.ulter();
		
	}



}
