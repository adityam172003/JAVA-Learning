
//13.WAP to check blocked state of a thread.


class Mythread implements Runnable
{
	boolean val =true;
	int c;
	synchronized public void run()
	{
		c++;
		while(val)
		{
		
		}
	}
}	



class Question_13
{
	public static void main(String [] args)throws Exception
	{
	
		Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();
		
		Thread   m1 = new Thread(t1);
		Thread   m2 = new Thread(t1);
		
		
		m1.start();
		m2.start();
		
		Thread.sleep(2000);
		System.out.println(m2.getState());
		
		t1.val =false;
		
	}
	
}
