package file_4_Producer_Consumer.Program3;
class Consumer implements Runnable
{
	Queue q;
	Thread t;
	
	public Consumer(Queue q)
	{
	
		this.q  = q;
		t       = new Thread(this); 
	}
	public void strt()
	{
		t.start();
	}
	
	public void run()
	{
		q.Consume();
	}
}	
