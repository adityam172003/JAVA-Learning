import java.util.*;

class Number
{

	private int x,y;
	
	public static void scan(Number s)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		s.x = sc.nextInt();
		System.out.println("Enter the second number");
		s.y = sc.nextInt();
		
	}
	
	public static void print(Number n)
	{		
		System.out.println("x = "+n.x);
		System.out.println("y = "+n.y);
	
	}
	
	
	public static Number add(Number b1,Number b2)
	{
		Number t = new Number();
		t.x = b1.x+b2.x;
		t.y = b1.y+b2.y;
		
		return t;
	
	}



}


class Question_14
{

	public static void main(String [] args)
	{
		Number t1,t2,t3;
	
		t1 = new Number();
		t2 = new Number();
		
		Number.scan(t1);
		Number.scan(t2);
		t3 = Number.add(t1,t2);
		Number.print(t3	);
	
	
	}

	
}
