import java.util.*;

class StudyCA
{
	int        a;
	static int b;
	
	// anonymous block
	{
		//excuted when object is created independent on the type of constructors 
		System.out.println("In the anonymous block 1");
		a=20;
	}
	
	{
		
		System.out.println("In the anonymous block 2");
		
	}
	
	{
	
		System.out.println("In the anonymous block 3");
		
	}
	public StudyCA()
	{
		System.out.println("In the default constructor");
	}
	 
}


class Question_6
{
	public static void main(String []xyz)
	{
		//  first anonymous block will get excuted and then constructors 
		//StudyCA s =new StudyCA();
		
		
		// multiple blocks present then will excute sequentially
		
		StudyCA s =new StudyCA();
		
		System.out.println(
		
		
	
	}


}
