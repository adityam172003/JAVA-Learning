

class Myclass implements Runnable
{
	int x;
	
	public void run()
	{
	 for(int i =0;i<10;i++)
	 {
	 	x++;
	 	System.out.println(x);
	 	
	 	try
	 	{
			Thread.sleep(1000);
		}
		catch(Exception w)
		{
		
		}
	 }
	}
}


class Question_13
{

	public static void main(String [] args) throws Exception
	{
		Myclass m = new Myclass();
		
		Thread  t = new Thread(m);
		
		t.start();
		Thread.sleep(11000);
		m.run();
		System.out.println("Main ends");
	}
}
