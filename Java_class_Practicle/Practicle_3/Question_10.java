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
	
	
	public Number add(Number b)
	{
		Number n =new Number ();
		
		n.x = this.x+b.x;
		n.y = this.y+b.y;
		
		return n;
	
	}


}





class Question_10
{

	public static void main(String [] args)
	{
		Number t1,t2,t3;
	
		t1 = new Number();
		t2 = new Number();
		t1.scan();
		t2.scan();
		t3 = t1.add(t2);
		t3.print();
	
	
	}

	
}
