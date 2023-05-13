class Myclass implements Runnable
{
	int x ;
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			x++;
			System.out.println(Thread.currentThread().getName()+" "+x);
			
			try
			{
				Thread.sleep(300);	
			}	
			catch(Exception w)
			{
			
			}
		}
		
	}
	
	
		
}


class Question_17
{
	public static void main(String [] args)throws InterruptedException
	{
		Myclass m1,m2;
		
		
		
		m1   = new Myclass();
		
		
		m2   = new Myclass();
		
		
		Thread t1 =  new Thread(m1,"t1");
		Thread t2 =  new Thread(m1,"t2");
		t1.start();
		t1.join();
		t2.start();
		
		
	}
}

