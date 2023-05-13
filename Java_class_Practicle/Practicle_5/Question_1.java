

import java.util.*;



/* 
Write separate program to check working of each string function we have seen
*/



class Number
{
	public int x, y;
	
	public Number()
	{
		x=10;
		y=20;
		
	}
	
	
	/*
		1  ] must be public 
		2  ] must have String return type
		3  ] should have toString() name 
	*/
	public String toString()
	{
	
		String s = "\nclass Name -: Number\nData Members -: int x , y ";
		
		return s;
	}
	
		
}




class Question_1
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		// 1 ] creation of string 
		
		String str1 = "first method";
		System.out.println("String = " +str1);
		
		/*
		String str2 = new String("second method");
		System.out.println("String = " +str2);
		
		char arr[]  ={'H','E','L','L' ,'O'}; 
		String str3 = new String(arr);
		System.out.println("String = " +str3);
		
		String str4 = new String(arr,1,3);
		System.out.println("String = " +str4);
		
		
		byte  arr5[]  ={'H','E','L','L' ,'O'} ;
		String str5 = new String(arr5);
		
		System.out.println("String = " +str5);
		*/
		
		
		// 2 ]  immutable strings 
		
		// here when we update str1 new object is created and its reference is returned 
		// check  identity code after updation it will different 
		
		
		/*
		
		System.out.println("identity code str1  "+ str1+" = "+System.identityHashCode(str1));
		str1 = "updated str1";
		System.out.println("identity code str1  "+ str1+" = "+System.identityHashCode(str1));
		
		*/
		
		
		// 3 ] array of strings 
		
		/*
		
		String array[] ;
		
		array = new String[3];
		System.out.println("Enter the strings ");
		
		for(int i =0;i<array.length;i++)
		{
			array[i] = sc.nextLine();
			
		}
		
		for(String i : array)
		{
			System.out.println(i);
		}
		
		*/
		
		
		
		
		
		
		
		// ----- inbuilt String Methods -----
		
		
		
		// 1 ] valueOf();
			// static member function of String class 
		
		String s1 ,s2,s3,s4;
		
		
		/*
		s1 = String.valueOf(1000);
		System.out.println("String s1 = " + s1);
		
		s2 = String.valueOf(100.555);
		
		System.out.println("String s2 = " + s2);
		
		s3 = String.valueOf('A');
		
		System.out.println("string s3 = "+ s3);
		*/
		
		
		// representation of object to string 
		
		Number obj = new Number();
		
		
		s1 = String.valueOf(obj);
		
		
		System.out.println("Object to String s1     = " + s1);
		
		
		// valueOf() internally calls toString() method of class Object 
		
		//System.out.println("Using toString() method = "+obj.toString());
		
		
		// toString internally calls two methods 
		   /*
		   	1 ] getClass() ---> returns the Class type object  
		   	              it is a non -static method of Object class 
		   	              
		   	              1 ] getName() ----> returns the name of the class
		   	                            non-static method of class Class  
		   	            	
		   	           
		        2 ] toHexString() ---> static method of class Integer 
		        	 	  ---- converts decimal to hexadecimal 
		        	 	 
		        3 ] hashCode() --->returns the hash code of the object 
		  			  ---- non-static method of class Object       
		  	 
		  	 when we define our own toString() method it will get excuted 
		  	 when we use valueOf() method which is calling toString method 
		  	 internally	 
		  
		   
		   */
		
		   /*
		   Class type = obj.getClass();
		   
		   s2         = type.getName();
		   
		   
		   int hash   = obj.hashCode();
		   
		   s3         = Integer.toHexString(hash);
		   
		   
		   System.out.println("Using internal implementation = "+s2+'@'+s3);	  
		  	
		
		
		   System.out.println("Own Defined toString() method    = "+obj.toString());
		
		    */
		
		
		
		
		 // ---- member functions of String class 
		 
		 
		 // 1 ] length() ;           -------------------> non-static memebr function 
		 		
		 /*
		 s3 = "this is length member function";
		 
		 int lengths3 = s3.length();
		 
		 System.out.println("Length of string '"+s3+ "' = " +lengths3);
		 */
		 
		
		 // 2 ] concatination of string 
		 	// concat(string -- )  -------------------> non-static member function 
		 	// it creates the new string and returns the reference of the new string
		 	
		 	
		 	// System.out.println(" " +obj); ...... String.valueOf() automatically gets called 
		 	
		 	
		 	
			
			
		
			s1 = "main string";
			s3 = " ,string going to concat with s1";
			s2 = s1.concat(s3);
			// there will be no change in s1 and s2 
			System.out.println("s1   = "+ s1);
			System.out.println("s3   ="+ s3);
			System.out.println("s1+s3 = s1.concat(s3)  = "+s2); 
		
		
		
		
		// character Extraction 
	
		// 1 ] charAt();              -------------------> non-static memebr function 
		
		char ch = s1.charAt(2);
		
		System.out.println("charactor at 2nd index of string s1 = "+ch);
		



		
		// 2 ] getChars(p1,p2,p3,p4)   ---------------------> non-static memebr function
		
		/*
			p1 = start_index of string
			
			p2 = end_index of string
			
			p3 = target array reference   -- we have to create our own array
			
			p4 = target array start index 
			
			// similar to getBytes() just make array of bytes 
			 --- here getBytes(p1,p2,p3,p4) is depriated 
			 	the new version is the 
			 		getBytes() -- without any parameters 
			 	this function will return reference of array directly 
			 	we don't need to create an array and to pass it 
	
		*/
		
		
		char array2[] = new char[30];
		char array3[] = new char[30];
		
		
		s3.getChars(0,s3.length()-3,array2,0);
		
		s3.getChars(2,8,array3,5);
		System.out.println("array2 = ");
		
		for(char i :array2)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("array3 = ");
		
		for(char i :array3)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		
		byte array4 [] =new byte[20];
		byte array5 [];
		
		//s3.getBytes(0,5,array4,5);  // this function is depricated you will get the worning 
		
		
		array5 = s3.getBytes()        // this is new version of getBytes() which returns the referenc
		                              //  no need to create an array
		        
		System.out.println("Byte array = ");
		for(byte i :array5)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		
		
		
		
		
		// 3 ] toCharArray()  -----------> non-static member function
				// no need to create new char array just  declare rereference 
		   
		     
		char array5 [];
		
		array5 = s3.toCharArray();
		
		System.out.println("array5 =");
		
		for(char i : array5)
		{
			System.out.print(i+" " );
		}
		System.out.println();
		
		
		
		
		
	
	// String comparison
	
	
	
	// in String class 
	
		/*
			hashCode depends on content of the string 
			
			two strings having same content will have same hashCode 
			
			but have different identityHashCode 
			
			as it is independent on content of the string 
			
			
			hashCode()                 --> non-static memeber function of Object Class
			
			identityHashCode(String s) --> static member fuction of the System class 
		
		*/
	
	
		s1 = "hello";
		s2 = new String("hello");
		s3 = "hello";
		System.out.println("String s1 = "+s1+" hashCode = "+s1.hashCode());    ///            <---------
		
		System.out.println("String s2 = "+s2+" hashCode = "+s2.hashCode());
	
		
		System.out.println("String s1 = "+s1+" identityCode = "+System.identityHashCode(s1));//<-------  
		
		System.out.println("String s2 = "+s2+" identityCode = "+System.identityHashCode(s2));
	
		
	
		// optimisation in strings 
		
		/*
			here string s1 and s3  have same reference 
			creating string in this case is jvms responsibility
			
			it will first check existing strings if it get same string then
			it will not create new string it returns the same reference 
			s1 = "hello"
			s3 = "hello"
			
			but in case of s2 
				creating string is our responsibility here we are using new operator 
				
				so jvm will create new object 
			
		*/
		
		
		
	        System.out.println("String s1 = "+s1+" hashCode = "+s1.hashCode());
		
		System.out.println("String s3 = "+s3+" hashCode = "+s3.hashCode());
	
		
		System.out.println("String s1 = "+s1+" identityCode = "+System.identityHashCode(s1));
		
		System.out.println("String s3 = "+s3+" identityCode = "+System.identityHashCode(s3));
	
	
		// changes made in s3 will  not affect the s1 as jvm create new updated string and
		// returns its refernce without changeing existing string --- strings are immutable 
		// s1 will remains unchanged 
		System.out.println("Updating string s3 ");
		
		s3 = "updated string ";
		System.out.println();
		
		
		System.out.println("String s1 = "+s1+" hashCode = "+s1.hashCode());
		
		System.out.println("String s3 = "+s3+" hashCode = "+s3.hashCode());
	
		
		System.out.println("String s1 = "+s1+" identityCode = "+System.identityHashCode(s1));
		
		System.out.println("String s3 = "+s3+" identityCode = "+System.identityHashCode(s3));
	
	
		
	
	
	
		// comparing strings using ' == '
		
		 	/*
		 	
		 		when we compare strings using ==
		 		we actually compare their identityHashCode;
		 		
		 		returns boolean value
		 	*/ 
		 	
		 	s1 = "hello";
		 	s2 = "hello";
		 	
		 	s3 = new String("hello");
		 	
		 	/*
		 	boolean result  = s1==s2;
		 	
		 	System.out.println("=================Comparions============================");	
			System.out.println("String s1 = "+s1+" hashCode = "+s1.hashCode());
		
			System.out.println("String s3 = "+s3+" hashCode = "+s3.hashCode());
			System.out.println("String s3 = "+s2+" hashCode = "+s2.hashCode());
	
		
			System.out.println("String s1 = "+s2+" identityCode = "+System.identityHashCode(s2));
		
			System.out.println("String s1 = "+s1+" identityCode = "+System.identityHashCode(s1));
		
			System.out.println("String s3 = "+s3+" identityCode = "+System.identityHashCode(s3));
		 	
			System.out.println("=============================================");		
		 	System.out.println("result of s1==s2 : " +result);
		
			boolean result2  = s1==s3;
		 	System.out.println("result of s1==s3 : " +result2);
	
			*/
			
			
			// to compare string by content use
			
				// equals() -----------------> non-static memebr function 
					// returns boolean value
				    	// considers case 
					
	
			boolean res = s1.equals(s2);
			
			System.out.println("result of s1.equals(s2) : " +res);
	
	
			boolean res2 = s1.equals(s3);
			
			System.out.println("result of s1.equals(s3) : " +res2);
	
	
	
	
			// to ignore case 
				// equalsIgnoreCase()
				// s1.equalsIgnoresCase();
		
		
		
		
		
		// regionMatches([p1],p2,p3,p4,p5);
		
		/*
		      [p1]  = case ignore parameter
				
				true  -> ignores the case
				false -> consider the case
				
				default false
				
			p2  =  starting index of source string 
			
			p3  =  target string
			
			p4  =  starting index of target string 
			
			p5  =  number of characters have to compare 
			
			
		*/
		
		
		s1 = "may be last function of the day";
		s2 = "may be not can go for the next one ";
		
		boolean result3 = s1.regionMatches(0,s2,0,8);
		
		System.out.println("result of s1.regionMatches(false___) = "+ result3);
		
		
		
		s1 = "maY bE last function of the day";
		s2 = "mAy be not can go for the next one ";
		
		boolean result4 = s1.regionMatches(true,0,s2,0,6);
		
		System.out.println("result of s1.regionMatches(true___) = "+ result4);
		
		
		
		// startsWith(s , [p]) ---------------------> non-static memeber function
						// return boolean 
						// paremeter is a string 
						// s -> string
						// p ->integer
						
			s1 = "check begining of the string";
			
			//boolean result5 = s1.startsWith("c");  //true
			
			//boolean result5 = s1.startsWith("che");  // true
			
			//boolean result5 = s1.startsWith("ad");   // false
			
		  
		        
		        boolean result5  = s1.startsWith("be",6);
		        
		        System.out.println("Start with  c = " +result5);
		        
		        
		// endsWith() ------------------------> non-static member function
						// returns boolean
						// 
					
							
			
		
		
		
		
	
	}
	

}
