class Grand
{
	int x;
	
	public Grand()
	{
		System.out.println("In grand class");
		x=10;
	}
	
	
	static{
	
		System.out.println("In the static block of Grand class");
		
	}
	
	void Display()
	{
		System.out.println("Display of grand clas");	
	}
	
	
	
	static void Show()
	{
		System.out.println("static Show  of Parent clas");	
	}
	

}


class Parent extends Grand
{
	
	public Parent()
	{
		System.out.println("In Parent class");
		x=20;
	}
	
	
	static{
	
		System.out.println("In the static block of parent class");
		
	}
	
	void print()
	{

		System.out.println("Print in Parent class");
		
	}
	
	
	
	static void Show()
	{
		System.out.println("static Show  of parent clas");	
	}
	
	
}


class Child extends Parent
{

	void childShow()
	{
	
		System.out.println("X= "+x);
		
	}

}


class Question_5
{

	public static void main(String []xyz)
	{
		Child ch = new Child();
		
		
		ch.childShow();
		ch.print();
		
		
	}
	
}



