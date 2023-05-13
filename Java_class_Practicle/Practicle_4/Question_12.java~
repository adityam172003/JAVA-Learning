import java.util.*;

class Number
{
	
	int x=10;
	
	public void  finalize()
	{	
		
		System.out.println("called"+(10/0));
		
	}	
	

}

//  1 ] 
// when GC calls the finalize() it will ignore the excaptions 
  // excution remains in flow
  
// 2 ] 
// when we call finalize explicitely it will gives excaptions and code will terminate 



class Question_12
{
	
	public static void main(String [] srgs)
	{
		Number b = new Number();
		// calling finalize explicitely 
		// b.finalize(); <---------- will generate exception code will terminate 
		
		
		b        = null;
		
		System.gc();
		System.out.println("End of main");
	}		
	
	
	
	
}




