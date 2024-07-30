
/*

			Interface 
			
		
		1 ] we use interface keyWord
		
		
		All the methods inside interface are public and abstract by default 
		
		ex 
		
		interface MyInterface
		{
			void show();
			public void show();
			abstract void show();
			abstract public void show();
		}
		
		all the above four decearation has same meaning
		== abstract public void show()
		
		
		
		
		2 ] Interface can contain data memebers also 
		
			those data members are static and final 
			
			but as they are final one rule is different that is 
			they must be initialized at the time of declaration only 
			
			
		to inherite interface we use 
			implements  keyWord
		 	-----------
		 	
	
*/

interface itr
{
	int n=20;
	
	void show();
	void disp();

	// interface can contains the private methods but we have to provide the method body 
	private void play(){
		System.out.println("Player plays itr in play function which  is private inside the interface ");
	}

	// we have default method here which is public and can have method body 

	default public void playPrivate(){
			play();
	}
	// this static is not inherited in child we have to use interface name and dot operator
	// to access it 
	static void getStatic()
	{
		System.out.println("This is static in itr");
	}
}


/*
      As myclass is implementing interface itr
      we have to override all the methods from itr in Myclass
      
      other wise it will generate an error 
      
      	Interface.java:61: error: Myclass is not abstract and does not override abstract method disp() in itr
	class Myclass implements itr

	Interface.java:64: error: Myclass is not abstract and does not override abstract method show() in itr
	class Myclass implements itr

      
*/

class Myclass implements itr
{
	public void disp()
	{
		System.out.println("Overriding disp method ");
	}
	
	public void show()
	{
		System.out.println("Overriding show method ");
	}
}

class file_4_Interface
{

	public static void main(String p[])
	{
					
					
		itr m = new Myclass();   // implementing runtime Polymorphism 
		m.show();
		m.playPrivate();					
		
		itr.getStatic();	
	}
	


}



