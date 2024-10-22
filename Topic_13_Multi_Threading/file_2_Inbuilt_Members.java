// Inbult functions or members of class Thread


/*
	1 ] currentThread();
		--> Static member function 
		--> Returns the reference  of Currently excuting thread object 
		--> Return type Thread 
		
			output = Thread[main,5,main]
					        |    |    |
                -------------    |     -----------	
			    |                |                |
	      Thread name        priority        Thread group 
		
	-----------------------------------------------------------------------------------------------	 
	
	2 ] getName()
		--> Non-Ststic member funtion 
		--> Returns the string "name of the thread"
		
			output = main 
	-----------------------------------------------------------------------------------------------

        3 ] setName()
        	--> Non-Ststic member funtion
        	--> Take string as a parameter 
        	
        	set the name of the thread 
        
        -----------------------------------------------------------------------------------------------
        
		Default priority of main thread is 5 

		For rest threads the default priority is inherited from its parent thread 





       4 ] setPriority()
       		--> Non-Static member function 
       		--> Take integer between 1 - 10 as paramaeter 
       		
       		--> if parameter is not in the range throws exception 
       	               -: illegalArgumentException
       	               
       -------------------------------------------------------------------------------------------------
       	               
       5 ] getPriority() 
        	--> Non-Static memebr function
        	--> return integer the priority of the thread 
       		Some static methods of priority 
       			 
       			1 ) Thread.MIN_PRIORITY  = 1
       			2 ) Thread.MAX_PRIORITY  = 10
       			3 ) Thread.NORM_PRIORITY = 5
       			
       --------------------------------------------------------------------------------------------------
       
      6 ] sleep()
      	       --> Static member function 
      	       --> Take milli second as a parameter 
      	       
      	       * ] This method 	throws 
      	       		=: InterruptedException
      	       		 1 ) it is a checked exception 
      	       		 2 ) we reqired to handle this exception our own 
      	       		
      	       		
      	       	public void run() throws InterrupterException
      	       	{
      	       	
      	       	}	
       	this will not work in the case of run() method
       	as it is overriden method whose header must be same as actual function decleared in Thread class 
       	so compulsary we have to use try__catch () block to handle this exception in run() method 
      
      ---------------------------------------------------------------------------------------------------
      
      
      7 ] isAlive()
      		--> Non-Static member function
      		--> Return boolean value 
      			: true  -> thread is not terminated 
      			: false -> thread is terminated 
      	
     	Life time of any thread is run() method 
     		when child thread completes the excution of run
     		method and comes out of run method it gets terminated
     		
      --------------------------------------------------------------------------------------------------- 
      
      8 ] join()
      	     --> Non-static member funtion 
      	     --> used to control the excution of multiple threads 
      	     --> main thread to wait till child thread's complete excution 
      	     
      	     it throws InterruptedException we have to handle it manually 
      	     using Throws 
      	     or
      	     try
      	     {
      	     
      	     }
      	     catch()
      	     {
      	     	
      	     }
      	method 
      	
      	-------------------------------------------------------------------------------------------------
      	
      	9 ] yield() 
      		
      		It passes the execution to the other waiting thread which has same priority 
      		else it will continue its execution 
      		
      		pause for some time and then again start the execution 
      		
      		
      		if there are multiple such threads then after leaving the processor 
      		when it will get the chance ones again it depends on thread schedular 
      		
      		and we cant expect it exactly 	
      		
      		public static native void yield() ;
      		
      		some operating system may not support preemptive scheduling so yield method will not work
      		in such systems
      	
		
		-------------------------------------------------------------------------------------------------
		
		10 ] stop()
			 	it is depricated method . It is not recommended to kill the 
				running thread 

		
		-------------------------------------------------------------------------------------------------
		

		11 ] suspent() and resume()

			 it is also depricated we should not use it 

			 
*/	






class MyClass extends Thread 
{
	static int a;
	public static void set()
	{
		Thread t    = Thread.currentThread();
		//t.setName("name is SET  in set function");
		String name = t.getName();
		
		
		
		int pr      = t.getPriority();
		System.out.println("Priority of "+name+" = " +pr);
		System.out.println("Name of the Working thread "+name);
		System.out.println("Current workig thread in set function = "+t);
		a=10;
		System.out.println("set function "+a);
			
	}
	
	public void run()
	{
		try
		{
			System.out.println("Inside try block in MyClass");
			Thread.sleep(5000);
		}
		catch(InterruptedException q)
		{
			System.out.println(q);
			
		}
		System.out.println("Run method in MyClass");
		MyClass.set();
	}	
	
}	


class file_2_Inbuilt_Members
{
	public static void main(String [] args) throws InterruptedException	
	{
		MyClass obj = new MyClass();	
		Thread t = new Thread(obj);
		t.setPriority(8);
		//t.setName("Aditya M");
		
		t.start();
		// at this stage child thread will  excute the run() method directly 
		
		
		// priorities 
		int min_p    = Thread.MIN_PRIORITY  ;
       		int max_p    = Thread.MAX_PRIORITY  ; 
       		int normal_p = Thread.NORM_PRIORITY ;
       		
       		System.out.println("Min priority    = "+min_p);
       		System.out.println("Max priority    = "+max_p);
       		System.out.println("normal priority = "+normal_p);
        		
		
		
		
		Thread excuter = Thread.currentThread();
		
		String name = excuter.getName();
		System.out.println("Name of the Working thread "+name);
		
		System.out.println("Currently excuting thread = " + excuter);
		
		Thread.sleep(3000);  
		
		t.setName("Aditya M");   // name is set by main thread 
		
		
		obj.set();
		
		//t.start();
		
		System.out.println("Main ends "+obj.a);
	}
}
