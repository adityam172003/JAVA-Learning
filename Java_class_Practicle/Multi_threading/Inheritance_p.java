





	// in run of Thread class
	
	/*
	
		Thread class
		{
			
			
			
			public Thread(Runnable r)
			{
				this.target = r;
				
			}
			
			
			public void run()
			{
				if (target!=null)
				{
					target.run();
				}
			}
		}
		
		
	*/











class Myclass implements Runnable
{

	public void run()
	{
		System.out.println("Thread = "+Thread.currentThread().getName());
		System.out.println("Run in Myclass");
	}
}




class Inheritance_p
{
	public static void main(String [] args)
	{	
	
		Myclass obj = new Myclass(); 
		Thread    t = new Thread(obj) ;
		
		t.run();
		
		System.out.println("MAIN ENDS");
		
	}
}
