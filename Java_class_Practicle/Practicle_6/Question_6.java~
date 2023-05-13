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
	int x;
	
	public Parent()
	{
		System.out.println("In Parent class");
		x=20;
	}
	
	
	static{
	
		System.out.println("In the static block of parent class");
		
	}
	
	int  print()
	{
	
		System.out.println("Print in Parent class x = "+x);
		
		System.out.println("X of Grand class using super keyword = " + super.x);
		return super.x;
	}
	
	
	
	static void Show()
	{
		
		System.out.println("static Show  of parent clas");	
	}
	
	
}


class Child extends Parent
{
	int x;
	public int print()
	{
		
		System.out.println("Static member function of parent class Show");
		super.Show();
		System.out.println("In the print of Child class");
		System.out.println("Accessing x of parent class x = "+ super.x);
		
		// calling show method of the parent class
		
		// here we can use super statement anywhere 
		System.out.println("print of parent class from child class");
		x = super.print();
	
		System.out.println("X of Grand class from child class "+x);
		return 0;
	}
	static{
	
		// here we cant use super key word 
		
		// we cant use it in static context 
	}

	void childShow()
	{
	
		System.out.println("X= "+x);
		
	}

}

// if we are acccessing any memeber function usign super 
// then it should be present in the parent class 
// super only access parent memembers 

class Question_6
{

	public static void main(String []xyz)
	{
		Child ch = new Child();
		
		
		ch.childShow();
		int x =ch.print();
		
		
	}
	
}



