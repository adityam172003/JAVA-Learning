

// no error it execute successfully

class A {
		public static void main(String []args)
		{
			A b= new B();
			System.out.println("Out");
		}
}

class B extends A
{
	public static void main(String...args)
	{
	
		System.out.println("In B class");
	}
}


// if you run class B then also main method will get called 


