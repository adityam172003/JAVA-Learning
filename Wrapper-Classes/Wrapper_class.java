import java.util.*;

class Wrapper_class

{	
	/*
		java is not completely Object Oriented Programming language 
		
		because of the some primitive data type 
		exa. : - int ,char ,float ,double, byte 
		
		so java has made some classes based on this data type 
		
		sometime we create the object of such classes to fulfil our 
		requrinments 
		
		int     - Integer 
		short   - Short
		byte    - Byte 
		long    - Long 
		float   - Float 
		double  - Double 
		boolean - Boolean
		char    - Character 
		
		to chack the size of each data type there is the static data 
	        member  defined in each 
		wrapper class except
		Boolean 
		
		: - BYTES
		-----------
		------------
		
		
		
	
	*/	
	public static void main(String [] args)
	{
	
	    System.out.println("size if byte   data type : " + Byte.BYTES      +" byte");
	    System.out.println("size if short  data type : " + Short.BYTES     +" byte");
	    System.out.println("size if int    data type : " + Integer.BYTES   +" byte");
	    System.out.println("size if float  data type : " + Float.BYTES     +" byte");
	    System.out.println("size if double data type : " + Double.BYTES    +" byte");
	    System.out.println("size if char   data type : " + Character.BYTES +" byte");
	
	   //------------------------------------------------------------------------------------
	
	    
	    
	    
	    // Integer 
	    //        fin =20;  -- it generates an error 
	Integer i = Integer.valueOf(10);
	
        System.out.println(Integer.toBinaryString(135)+ " "+Integer.toBinaryString(Integer.reverseBytes(135))); 
        System.out.println(Integer.reverse(135)>>>(int)(Math.log(Integer.lowestOneBit(Integer.reverse(135)))/Math.log(2)));
        

        System.out.println("i = " + i.getClass().getName() );
	}






}
