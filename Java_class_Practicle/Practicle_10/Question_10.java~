/*
	10.
	class Yourclass10
	{
		int x;
		void change();
	}
	class Mythread10
	{
		
	}

	Create 2 threads and set them on different objects of class Mythread10.Send both threads 
	in change() method of class Yourclass10 on same calling object.Check the ouotput.
	Now control the execution using only sleep() method.
	Then try to control execution using join() method.
	Now try to control execution using synchronization.

*/

class Yourclass
{
	int x;
	
	public void change()
	{
		for(int i =0;i<10;i++)
		{
			x++;
			Thread t = Thread.currentThread();
			
			System.out.println(x+""+t.getName());
			
			try
			{
				Thread.sleep(1000);
			}	
			catch(Exception e)
			{
			
			}	
		
		}	
	}
}


class Mythread implements Runnable
{
	Yourclass y;
	
	public Mythread(Yourclass y)
	{
		this.y =y;
	}
	
	public void run()
	{
		synchronized(y)
		{
			y.change();
		}
		
		
		
	}	
	
}

class Question_10
{
	public static void main(String [] arrgs) throws Exception
	{
		Yourclass y  = new Yourclass();
		
		Mythread m1 ,m2;
		Thread  t1 ,t2;
		
		m1 = new Mythread(y);
		m2 = new Mythread(y);
		
		t1 = new Thread(m1,"t1");
		t2 = new Thread(m2,"t2");
		
		t1.start();
		//Thread.sleep(10000);
		//t1.join();
		t2.start();
	}
}


