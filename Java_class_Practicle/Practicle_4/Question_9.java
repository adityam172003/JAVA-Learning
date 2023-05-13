import java.util.*;

class Number
{
	int x =10;
	

}



class Question_9
{

	public static void main(String [] args)
	{
		// making object available for gc 
		
		// 1 ] nullifying the reference
		
		Number ref  = new Number();
		
		ref         = null;
		
		// 2 ] assigning the referencec to some other object
		
		Number r1   = new Number();
		Number r2   = new Number();
		r1          = r2;
		
		
		// 3 ] creating object inside method
		
		myFun();
	}
	
	
	public static void myFun()
	{
		Number obj = new Number();
		
	}



}
