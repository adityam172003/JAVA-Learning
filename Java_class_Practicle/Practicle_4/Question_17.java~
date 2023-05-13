class Number
{
	int x=10;
	
	public void finalize()
	{
		System.out.println("Called");
	}

}







class Question_17
{
	public static void main(String [] arhs)
	{
		Number n  = new Number();
		 
		Runtime r = Runtime.getRuntime();
		
		System.out.println("Hash code = "+r.hashCode());
			
		Runtime r1 = Runtime.getRuntime();
		
		System.out.println("Hash code = "+r1.hashCode());
		
		// hash code for both the reference variable is same which indicates that
		// Runtime is singletone class We can create ony one object of this class
		// that one also using static method getRuntime() 
		 
	}
}
