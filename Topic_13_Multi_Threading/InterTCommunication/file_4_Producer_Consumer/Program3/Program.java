package file_4_Producer_Consumer.Program3;

class Program
{
	public static void main(String args[])
	{
	
		Queue    q   = new Queue();
		Producer p   = new Producer(q);
		Consumer c   = new Consumer(q);
		
		p.strt();
		c.strt();
	}
	
}
	