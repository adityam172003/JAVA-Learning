// program 3 ] 

class Parent  
{
	public int    a;
	public String s;
	
	
	 void getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		a =sc.nextInt();
		System.out.println("Enter the name")  ;
		
		sc.nextLine();
		s = sc.nextLine();
	}
	
	
	void showData()
	{
		System.out.println("Name = "+s);
		System.out.println("a    = "+a);
	}
	
}

// here getData and setData is overried 

/*
	first requirnment of the overriging is inheritance 
	                                      -------------
	
	1 ] function which is going to overriden must have same header  in both parent and child class
	                                                   -------------------------------------------
	                                                   
	2 ] child class overriden method must have Stronger access specifier than the access
		specifiers in the parent class method 
	
	Private < default < Protected < public 
	--------------------------------------
	
	ex.
	
	if parent class method is default then its overriden version in child class
	can be default , protected ,public 
	
	if parent class method is public then its overriden version must be defined public 
	
	
	
	/-------------------------------------------------------------------------------------/
	
	Here if child class contain the method which is present in the parent class then 
	if child  object calls that method then preference is given to child class method 
	
	else if that method is present only inside the parent class then that parent class method 
	gets called |||||||||||.............|||||||||||
	
	
	
	
	
*/


class Child extends Parent
{
	int p;
	
	public void getData()
	{
		super.getData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		p =sc.nextInt();
		
	}
	
	public void showData()
	{
	
		super.showData();
		System.out.println("a    = "+p);
	}
	
	
}
