import java.util.*;

class Employee
{
	String name;
	String compeny_name;
	int salary;
	
	public void getData()
	{
		Scanner sc   = new Scanner(System.in);
		sc.nextLine();
		System.out.println("Enter the name :");
		name         = sc.nextLine();
		
		System.out.println("Enter compeny name :");
		compeny_name = sc.nextLine();
		
		System.out.println("Enter the salary :");
		salary       = sc.nextInt();
	}
	
	
	public void  finalize()
	{	
		// System.out.println("Name = "+name); 
		System.out.println("called");
		
	}	
	

}



class Question_10
{
	
	public static void main(String [] srgs)
	{
		Employee e  = new Employee();
		
		
		e.getData();
		
		e=null;
		
		System.gc();
		System.out.println("End of main");
	}		
	
	
	
	
}




