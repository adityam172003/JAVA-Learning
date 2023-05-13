

class MythClass implements Runnable
{

	volatile boolean x=true;
	
	
	synchronized public void run()
	{
	
		
		
		while(x)
		{
			Thread t = Thread.currentThread();
			
			
			System.out.println("Thread name = "+ t.getName()+" " + x);
			
		}
	}
}

class Question_20
{

	public static void main(String p [])throws Exception
	{
		MythClass  m  = new MythClass();
		
		Thread t2 = new Thread(m,"t2");
		Thread t1 = new Thread(m,"t1");
		
		
		t1.start();
			
		t2.start();
		
		Thread.sleep(1000);
		m.x=false;
		
		
		 
	}	
	
}	
