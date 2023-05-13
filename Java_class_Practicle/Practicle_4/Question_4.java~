import java.util.*;
class Base
{
	int bs;
}
class Power
{
	int pw;
}
class Operation
{
	private Base base;
	private Power power;
	void getData()
	{ 
		base  = new Base();
		power = new Power();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base");
		base.bs = sc.nextInt();
		System.out.println("Enter the power");
		power.pw = sc.nextInt();
		
	}
	int calc()
	{ 
		int ans = 1;
		for(int i =0;i<power.pw;i++)
		{
			ans= ans*base.bs;
			
		}
		
		return ans;
	
	}
}
class Question_4
{
	public static void  main(String [] args)
	{
		Operation op;
		op = new Operation();
		
		op.getData();
		int ans = op.calc();
		
		System.out.println("ans  = "+ans);
	}
}

