class Myclass implements Runnable
{
	int x;
	
	public void run()
	{
	
		System.out.println("In Run method ");
	}
	
	
}



class Creating_Thread
{
	public static void main(String [] args)
	{
	
		Thread t1;
		Myclass obj;
		
		// 1 ] create object
		obj = new Myclass();
		
		// 2 ] create object of Thread
		t1  = new Thread(obj);
		
		// 3 ] start it 
		t1.start();
		
		System.out.println("Main ends ");
	}
	
}
