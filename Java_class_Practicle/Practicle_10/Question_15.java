/*
	15.WAP to explain working of synchronization using depositor and receiver program we have seen in lecture
*/


class Receiver 
{
	int amount;
	
	Receiver()
	{
		amount =1000;
		
	}
	
	
	
	public void add(int a)
	{
		
		Thread t = Thread.currentThread();
		
		System.out.println("Initial amount = "+amount+" depositer = "+t.getName() );
		
		amount+=a;
		System.out.println("Final amount = "+amount+" depositer = "+t.getName() );
		
	}	
	
	

}




class Depositer implements Runnable
{
	Receiver r;
	int a;
	Thread t ;
	
	Depositer(Receiver r,int a,String nam)
	{
		this.r = r;
		this.a = a;
		t      = new Thread(this,nam); 
			
	}	
	void strt()
	{
		t.start();
	}
	
	public void run()
	{
		synchronized(r)
		{
			r.add(a);
		}
	}
	
	
}


class Question_15
{
	public static void main(String args[])
	{
		Receiver r = new Receiver();
		
		Depositer d1 ,d2 ,d3;
		
		d1 = new Depositer(r,1000,"d1");
		d2 = new Depositer(r,2000,"d2");
		d3 = new Depositer(r,3000,"d3");
		d1.strt();
		d2.strt();
		d3.strt();
	}
}
