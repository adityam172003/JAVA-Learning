
import java.util.Scanner;

class Date
{
	private int day;
	private int month;
	private int year;
	

	public Date()
	{
		day   = 0;
		month = 0;
		year  = 0;
	}
	
	void  getDate()
	{
		Scanner sc = new Scanner(System.in);
	  	System.out.println("Enter the date");
	  	day = sc.nextInt();
	  	System.out.println("Enter the month");
	  	month = sc.nextInt();
	  	System.out.println("Enter the  year");
	  	year = sc.nextInt();
	  	
	}
	
	void showDate()
	{
	
		System.out.println(day+"/"+month+"/"+year);
	
	}
	
	public int getDiffer(int cyear)
	{ 
		return  (cyear -year );
	}

}
