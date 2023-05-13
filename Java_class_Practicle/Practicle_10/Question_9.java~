/*
	9.
	class Mythread
	{
		int x;
	}

	Create 2 threads of class Mythread in main() function.Both threads increase value of x by 1
	for 10 times.Now set both threads on different objects of class Mythread.Check the output.
	Now apply synchronization and check if it is applied or not.
	Now set both threads on same object of class Mythread.Check if synchrinization is applicable
	or not.

*/


class Mythread implements Runnable
{
	int x;
	public void run()
	{	
		increase();
	}	
	
	  public void increase()
	{
	
		for(int i =0;i<10;i++)
		{	
			x++;
			System.out.println(x);
			try
			{
			   Thread.sleep(500);
			
			}
			catch(Exception w)
			{}
		}	
		
	}
}	



class Question_9
{
	public static void main(String [] arrgs)
	{
		Mythread  m1,m2;
		
		Thread t1,t2;
		m1 = new Mythread();
		m2 = new Mythread();
		
		t1 = new Thread(m1);
		t2 = new Thread(m2);
		t1.start();
		t2.start();
		
	}
}











