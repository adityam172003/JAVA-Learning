

class Yourclass implements Runnable
{
	public void run()
	{
		System.out.println("IN Run of Yourclass "+Thread.currentThread().getName()); 
	}

}





class Myclass implements Runnable
{
	int x;
	
	Myclass()
	{
		x=10;
		Thread ctr  = Thread.currentThread();
		String s  = ctr.getName();
		try 
		{
		
			Thread.sleep(3000);
			
		}
		catch (Throwable t)
		{		
		
		}
		
		System.out.println("Thread name = "+s);
		
	}
	
	
	public void run()
	{
		Thread t;
		Myclass m;
		
		// this will run infinte time  
		Thread ctr  = Thread.currentThread();
		String s  = ctr.getName();
		System.out.println("Thread name = "+s);
		
		ctr.setPriority(4);
		System.out.println("Priority in run = "+ctr.getPriority());
		/*
		
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
			m = new Myclass();
			
			t = new Thread(m," thread  created in run");
			
			t.start();
			
			t.join();
			
			System.out.println(Thread.currentThread().getName());
			
		*/
		Yourclass y  = new Yourclass();
		Thread    t2 = new Thread(y);
		
		try
		{	
			System.out.println(Thread.currentThread().getName());
			t2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
			
	}
}



class Methods
{
	public static void main(String [] args) throws InterruptedException
	{
		
		Thread t;
		Myclass m;
		
		
		Thread ctr  = Thread.currentThread();
		String s  = ctr.getName();
		System.out.println("Main Starts");
		
		m = new Myclass();
		t = new Thread(m," thread  created in main");
		
		System.out.println("Priority = "+t.getPriority());
		
		
		t.start();
		//Thread.sleep(2000);	
		t.join();
		System.out.println("Priority = "+t.getPriority());
		System.out.println("t is alive = " + t.isAlive());
		
		
		
		System.out.println("Main ends");
		
	
	}

}
