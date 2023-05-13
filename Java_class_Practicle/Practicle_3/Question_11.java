import java.util.*;

class Number
{

	private int x,y;
	
	public void scan()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		x = sc.nextInt();
		System.out.println("Enter the second number");
		y = sc.nextInt();
		
	}
	
	public void print()
	{		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	
	}
	
	
	public void add(Number b1,Number b2)
	{
		this.x = b1.x+b2.x;
		this.y = b1.y+b2.y;
	
	}



}


class Question_11
{

	public static void main(String [] args)
	{
		Number t1,t2,t3;
	
		t1 = new Number();
		t2 = new Number();
		t3 = new Number();
		t1.scan();
		t2.scan();
		t3.add(t1,t2);
		t3.print();
	
	
	}

	
}
