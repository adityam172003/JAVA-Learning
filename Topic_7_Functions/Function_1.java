 
 /*
 	
 	Every function in the java is the member function 
 	we can not create the independent functions in 
 	the java
 	
 	Method Signature 
 	
 	In Java, the term "method signature" refers to the essential components of a method declaration that uniquely identify the 
 	method within a class. The method signature includes the method's name, its parameter types (also called the method's 
 	parameter list), and its return type (if applicable).
 		
 	 : method_name(argument  type);
 	 
 	 this is the basic structure of the method signature 
 	 
 	 
 	 
 	 There are two types of functions presente in the java
 	 
 	 1 ] static 
 	 
 	 2 ] non-static
 	 
 	 static belongs to the class
 	 
 	 non-staic belongs to the object
 	 
 	 
 	 
 	 basic structure of defining the function in java
 	 
	 // first access specifiers are required like public / private /protected or static
	  and then return types remember 

	  

 	 access_specifier  [static ]  [return type]  function_name (arguments)
 	 {
 	 		body 
 	 		
 	 		
 	 		depending on the data type of return or void function will return the values
 	 		
 	 		
 	 		
 	 {
 	 
 	 
 	 
 	 // rest is same as c++;
 	 
 		
 */
 
 
 
 
 public class Function_1
{
	public static void main(String args[])
	{
		Function_1.myfun();
		
		
		
		
	
	}
	
	// this two function signatures are same accoridingly JVM becaues 
	// the method signature is :  get(int) 
	// for both the functions so willl generate the completime error 
	/*
	public void get(int p){
	
	}
	
	
	public int get(int p)
	{
	
	}
	
	*/
	
	public static void myfun()
	{
		System.out.println("function call from myfun function ");
			
	}
	static public void myFun2()
	{


	}





}