// resurrstion of object 

class Question_19
{
	static Question_19 ref;
	
	public void finalize()
	{
		ref = this ;
		
		System.out.println("Called");
		
	}
	
	public static void main(String [] arhds)
	{
		Question_19 q = new Question_19();
		
		q             = null;
		
		System.gc();
		
		ref.finalize();
		
		ref           = null;
		
		System.gc();
		
		System.out.println(ref.hashCode());
		System.out.println("Main end");
	}
}
