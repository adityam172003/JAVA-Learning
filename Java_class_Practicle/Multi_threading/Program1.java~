

class Myclass implements Runnable 
{	
	int x;
	
	public void run()
	{
		System.out.println("Run method  in Myclass ");
		
	}
}


class Yourclass implements Runnable
{
	int y;
	
	public void run()
	{
	
		System.out.println("Run in Yourclass");
	}

}


class Program1 
{
	public static void main(String [] args)
	{
		Myclass   m1 = new Myclass()  ;
		Yourclass y1 = new Yourclass();
		
		Thread t     = new Thread(m1);
		
		t.start();
		
			t    = new Thread(y1);
		t.start();
		
		System.out.println("Main ends");
		 
	}
	
}
