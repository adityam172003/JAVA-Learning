


// we can not override the final it will generate compiltime error 

/*

	Final_Override.java:15: error: show() in Override cannot override show() in Final_override
		public void show()
		            ^
	  overridden method is final
	1 error


*/

 class Final_override
{

	public final void show()
	{
		System.out.println("Parent");
	}
}


class Override extends Final_override
{
		public void show()
		{
			System.out.println("Parent");
		}
}


class Main
{
	public static void main(String...args)
	{
			Final_override f = new Override();
			
			
			f.show();
	}
}
