
class Myclass implements Runnable
{
	public void run()
	{
		System.out.println("HELLO WORLD");
	}
	
}


class Question_11
{
	public static void main(String [] args) throws InterruptedException
	{
		Myclass m;
		Thread t ;
		
		m = new Myclass();
		t = new Thread(m,"java");
		
		t.start();
		t.join(); // throws interruptedException 
		
		System.out.println("Main ends");
	}
}
