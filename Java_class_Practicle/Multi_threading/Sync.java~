



class Myclass implements Runnable
{
	int x;
	
	public Myclass()
	{
		x=20;
	}
	
	public void run()
	{
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName());
		
		try
		{
		
			Thread.sleep(2000);
			
		}
		catch(InterruptedException e)
		{
			
		}
		
		System.out.println("X = "+x);
		show();
		
		
		
	}
	
	
	public void show()
	{
		System.out.println("IN THE SHOW Through  = "+Thread.currentThread().getName());
		x=30; 
	}	
	
}



class Sync
{
	public static void main(String [] args)
	{
		Myclass obj1 ,obj2;
		
		Thread t1,t2;
		
		obj1   = new Myclass();
		obj1.x = 100;
		obj2   = new Myclass();
		obj2.x = 200;
		
		    t1 = new Thread(obj1,"t1");
		    t2 = new Thread(obj2,"t2");
		
		t1.start();
		t2.start();
		
		System.out.println("Main ends");
		  
	}	
	
	
	

}	






