//4.WAP to understand object resurrection.




class Question_4
{
	public static Question_4 ref;
	public static void main(String [] args) throws Exception
	{	
		Question_4 obj = new Question_4();
		obj=null;
		System.gc();
		Thread.sleep(200);
		System.out.println(ref);
		// finalize method will run only once for an object 
		ref = null;
		
		System.gc();
		Thread.sleep(200);
		System.out.println(ref);
	}
	
	
	
	public void finalize()
	{
		ref = this;
		System.out.println("Finalize method ");
	}

}
