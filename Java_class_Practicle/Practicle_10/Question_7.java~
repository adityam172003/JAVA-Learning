/*
7.WAP to create a thread and check following states.
NEW,RUNNABLE,TERMINATED,TIMED_WAITING

*/

class Mythread implements Runnable
{
	public boolean val=true;
	public void run()
	{
		
		System.out.println("Run in Mythread");	
		
	 	try
	 	{
	 		Thread.sleep(5000);
	 	}
	 	catch(Exception e)
	 	{
	 	
	 	}
		
		while(val)
		{
		
		
		}
		
	}
	
	
}


class Question_7
{
	public static void main(String [] args)throws InterruptedException
	{
		
		Mythread m = new Mythread();
		Thread  t = new Thread(m) ;
		
		System.out.println(t.getState());  // NEW 
		t.start();
		Thread.sleep(2000);
		System.out.println(t.getState()); // TIMED_WAITING
		
		Thread.sleep(3000);
		System.out.println(t.getState()); // RUNNABLE
		m.val =false;
		
		
		Thread.sleep(1000);
		
		System.out.println(t.getState()); // TERMINATED
		
		
		
		
	}


}
