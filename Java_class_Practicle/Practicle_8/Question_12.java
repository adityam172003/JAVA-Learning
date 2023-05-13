

class Myclass implements Runnable
{
	public void run()
	{
		Thread t    = Thread.currentThread();
		
		String name = t.getName();
		
		System.out.println("Thread name = "+name+" Priority = "+t.getPriority());
		
		
		try
		{
			Thread.sleep(1000);
		}
		catch(Throwable tt)
		{
			
		}
	}
}




class Question_12
{	
	public static void main(String []args)
	{
	
		Myclass m  = new Myclass();
		Thread  t  = new Thread(m);
		t.setName("mythread");
		t.setPriority(1);
		
		t.start();
		
		System.out.println("Main end");
	}
}
