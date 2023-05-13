import java.util.*;

class Number
{
	private int x,y;
	void getNumber()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values ");
		x = sc.nextInt();
		y = sc.nextInt();
		
	
	}
	
	
	void ShowNumber()
	{
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
	
	}
}
class Digit
{
	public Number obj;
	int z;
	void getDigit()
	{ 
		obj = new Number();
		obj.getNumber();
		System.out.println("Enter the value of z");
		Scanner sc = new Scanner(System.in);
		z = sc.nextInt();
		
	
	
	}
	void showDigit()
	{ 
	
		System.out.println("z = "+z);
		obj.ShowNumber();
	
	}
}
class Question_2
{
	public static void main(String [] xyz)
	{
		Digit D;
		D = new Digit();
		D.getDigit();
		D.showDigit();
		//Scan data for D and print it.
	}
}
