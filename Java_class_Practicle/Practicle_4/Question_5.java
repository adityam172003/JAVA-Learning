import java.util.Scanner;
class Base
{
	private int bs;
	
	public void getBase()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		bs = sc.nextInt();
		
	}
	
	public int giveBase()
	{
		return bs;
	}
}
class Power
{
	private int pw;
	
	
	public void getPower()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the power");
		pw = sc.nextInt();
		
	}
	
	public int givePower()
	{
		return pw;
	}
	
}
class Operation
{
	private Base base;
	private Power power;
	void getData()
	{ 
		base  = new Base();
		power = new Power();
		
		base.getBase();
		power.getPower();
		
		
		
	}
	int calc()
	{ 
	
		int p = power.givePower();
		int b = base.giveBase();
		int ans =1;
		for(int i =0;i<p;i++)
		{	
			ans = ans*b;
		}
		
		return ans;

	
	}
}
class Question_5
{
	public static void  main(String [] args)
	{
		Operation op;
		op = new Operation();
		op.getData();
		int ans = op.calc();
		
		System.out.println("ans  = "+ans);
		//Complete the program to find base^power
		//print answer here in main().
	}
}
