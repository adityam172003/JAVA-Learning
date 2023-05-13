class Myclass implements Runnable
{
	int x ;
	
	public void run()
	{
		System.out.println(" Thread name = "+Thread.currentThread().getName()+"x = +"+x);
		
	}
	
	
		
}


class Question_14
{
	public static void main(String [] args)
	{
		Myclass m1,m2;
		
		
		
		m1   = new Myclass();
		m1.x =24;
		
		m2   = new Myclass();
		m2.x = 48;
		
		Thread t1 =  new Thread(m1,"t1");
		Thread t2 =  new Thread(m2,"t2");
		t1.start();
		t2.start();
		
		
		
		
		
	}
}

