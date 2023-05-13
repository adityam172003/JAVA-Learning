/*
	14.Scan a radius of circle from user.Create 2 threads to find area and circumference of a circle.
Think how can you implement thread concept.


*/


class Circle implements Runnable
{
	int r;
	Circle(int r)
	{
		this.r = r;
		
	}
	
	public void area()
	{	
		System.out.println("Area of circle = "+ (r*r*(3.14)));
	}
	
	public void circum()
	{
		System.out.println("Curcumference of circle = "+ (2*3.14*r));
	}
	
	
	public void run()
	{
		Thread t = Thread.currentThread();
		
		if(t.getName().equals("t1"))	
		{
			area();
		}
		else
		{
			circum();
		}
	}
	
}



class Question_14
{

		public static void main(String s[])
		{	
			Circle cr = new Circle(5);
			
			Thread t1 = new Thread(cr,"t1");
			Thread t2 = new Thread(cr,"t2");
			
			t1.start();
			t2.start();
		}
}


