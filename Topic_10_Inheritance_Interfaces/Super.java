// program 4 ]

import java.util.Scanner;

// the supre keyword



/*
	1 ] we use super keyWord to access the non-static members of the parent class
	2 ] it is non-static keyWord we can use it only inside the non-static member function 
	3 ] super can refer to the memeber function of parent class only 
		if the acccessing member is not present in the parent class
		it will generate an error
		even if the membre present in the child class..............
                       
       	          
	 the super statement can be first statement can be the last statement  in the program
	 but this rule will change in the contructor
	 
	 
	 we can use super inside non-static context only
	 
	 but we can access static members of parent class using super keyWord  from
	 non -static context of child class 
	 
	 

*/

class Parent  
{
	public int    a;
	public String s;
	public static int st=2000;
	public static void f()
	{
		System.out.println("Static contest ");
	}
	
	 void getData()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number in parent class");
		a =sc.nextInt();
		System.out.println("Enter the name")  ;
		
		sc.nextLine();
		s = sc.nextLine();
	}
	
	
	void showData()
	{
		System.out.println("Name = "+s);
		System.out.println("a in parent class   = "+a);
	}
	
}


class Child extends Parent
{
	int a;
	/*
		error will generate 
		
		lenovo@LENOVO-PC:~/Java_Programming/Inheritance_Interfaces$ javac Super.java 
		Super.java:63: error: non-static variable super cannot be referenced from a static context
					super.f();

		super belongs to non-static context we cant use it in static context 
		but we can access static members using super keyword 
		
	public static void static_S()
	{
		super.f();
	}
	*/	
	public void getData()
	{
		super.f();   // we can access static methods 
	
		super.getData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in child class "); 
		super.a =sc.nextInt();  // accessing parent's   data memebr a <--------|||||||
		System.out.println("accessing static member of parent class using super = "+ super.st);
	}
	
	public void showData()
	{
	
		super.showData();
		System.out.println("a in child class  = "+a);
	}
	
	
	
	
}


class Super
{

	public static void main(String [] args)
	{
		Child c = new Child();
		c.a = 10;
		System.out.println(c.a);
		c.getData();
		c.showData();
	
	}
	
	


}

