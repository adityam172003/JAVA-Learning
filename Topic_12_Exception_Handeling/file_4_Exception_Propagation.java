

/*
    Java Exception Propagation

    reference : https://www.javatpoint.com/exception-propagation



    Exception propagation refers to movement of exception event from nested 
    try or nested methods calls. A  try block  can be nested within another 
    try block. Similarly a method can call another method where each method 
    can handle  exception  independently  or can   throw  checked/unchecked
    exceptions. Whenever an exception is  raised within a nested try block/
    method,  its   exception is pushed  to Stack.  The exception propagates
    from child to  parent try block  or from child  method to parent method 
    and so on.



 */

 /*
   In the below example 

   fun3()
     |
     | ----- > calls child1 function -----> fun2()
                                             |
                                             |-----> calls child2 function ----> fun1()
                                                              
        
    Here fun1 throws the eception which is propagated from 
    fun1 to fun2 and then fun3 which is parent function and handled in parent fun3() function 
  */


 class Test_1{

    public void fun1()
    {
        throw new RuntimeException("This is exception thrown in fun1() function ");
    }

    public void fun2()
    {
        fun1();

    }

    public void fun3()
    {
        try{
            fun2();
        }
        catch(Throwable th)
        {
            System.err.println(th.getMessage());
            System.out.println("Exception handled in fun3() function ");
        }
    }

 }

public class file_4_Exception_Propagation {
    public static void main(String[] args) {
        
        Test_1 tst  = new Test_1();
        tst.fun3(); 
    }
}
