import java.util.Scanner;

class Number
{
	public int x,y;
}
class Digit
{
	public Number obj;
	int z;
	void getDigit()
	{ 
		obj = new Number();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		z = sc.nextInt();
		System.out.println("Enter the number in Number obj x and y");
		obj.x = sc.nextInt();
		obj.y = sc.nextInt();
		
	
	}
	void showDigit()
	{ 
		System.out.println("Z = "+z);
		System.out.println("x = "+obj.x);
		System.out.println("y = "+obj.y);
	
	}
}
class Question_1
{
	// Q ] 1 
	public static void  main(String [] args)
	{
		Digit D ;
		D = new Digit();
		D.getDigit();
		D.showDigit();
		
	}
}
