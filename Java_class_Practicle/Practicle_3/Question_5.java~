import java.util.Scanner;


class StaticBlock
{
	int x;
	static int y;
	
	
	public static void Show()
	{
		System.out.println("static member function");
		
	
	}
	// Static block            
	static
	{
		System.out.println("in the static block 1");
		y=1;
		System.out.println("Accessing static data member y = "+y); 
	}
	
	static
	{
		System.out.println("in the static block 2");
		System.out.println("Creatring local variables in the static blocks ");
		
		int a =50;
		StaticBlock st=new StaticBlock();
		st.x =50;
		
		System.out.println("Accessing non-static data member x= "+st.x);
		
		
	}
	
	
	static
	{
		System.out.println("in the static block 3");
		
	}


}


class Question_5
{
	
	public static void main(String [] args)
	{
		// atleast one Action should be performed to excute satic block
	
		// 1 ] accessing static data members 
	
		//StaticBlock.y=12;
		
		// 2 ] accessing static memebre function
		
		//StaticBlock.Show();
		
		// 3 ] creating the object of the class
	        //     if we decleare only reference variable then static bock will not being excuted
		
		//StaticBlock st = new StaticBlock();
		
		
		
		//  if there ara multiple static blocks then the will excute sequentially
		//  StaticBlock.Show();
		
		// first all static blocks get excuted 
		// they will excute only once in the program
		
		
		// can access Static data members directy only
		//StaticBlock.Show();
		
		// cant access non-static data members directly
		// can create locally ... and access using object name and (.) operator
		
		StaticBlock.y=12;
	
		
	}
	

}
