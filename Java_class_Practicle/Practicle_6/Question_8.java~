class Grand
{
	int x;
	 
	public Grand()                                                     // <---------------- 4]
 	{
		System.out.println("In grand class");
		x=10;
	}
	
	
	static{	                                                      // <---------------- 1]
	
		System.out.println("In the static block of Grand class");
		
	}
	
	// anonymous block 
	{	                                                   // <---------------- 5]
			
		System.out.println("Anonymoues block of Grand class");
			
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
	
	public Parent()                                                   // <---------------- 6]
	{
		System.out.println("In Parent class");
		x=20;
	}
	
	
	static{                                                   // <---------------- 2]
	
		System.out.println("In the static block of parent class");
		
	}
	
	// anonymous block 
	{                                                   // <---------------- 7]
			
		System.out.println("Anonymoues block of Prent class");
			
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
	
	public Child()                                                   // <---------------- 8]
	{
		System.out.println("In Child class");
		x=20;
	}
	
	
	static{                                                   // <---------------- 3]
	
		System.out.println("In the static block of parent class");
		
	}
	
	// anonymous block 
	{                                                   // <---------------- 9]
			
		System.out.println("Anonymoues block of Prent class");
			
	}
	
	void childShow()
	{
	
		System.out.println("X= "+x);
		
	}

}


class Question_8
{

	public static void main(String []xyz)
	{
		Child ch = new Child();
		
		
		ch.childShow();
		ch.print();
		
		
	}
	
}



