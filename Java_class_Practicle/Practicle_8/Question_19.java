

class MythClass implements Runnable
{

	int x;
	
	
	synchronized public void run()
	{
	
		
		
		for(int i =0;i<10;i++)
		{
			Thread t = Thread.currentThread();
			x++;
			
			System.out.println("Thread name = "+ t.getName()+" " + x);
			
		}
	}
}

class Question_19
{

	public static void main(String p [])
	{
		MythClass  m  = new MythClass();
		
		Thread t2 = new Thread(m,"t2");
		Thread t1 = new Thread(m,"t1");
		
		
		t1.start();
			
		t2.start();
	}	
	
}	
