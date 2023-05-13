/*
Create a database for employees containing name,aga,salary and hometown.
Print only those employees whose age is greater than 25.

*/

import java.util.Scanner;

class Employee
{

	private String name;
	private int age;
	private int salary;
	private String homeTown;
	
	
	public void GetData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the employee");
		name   = sc.nextLine();
		
		System.out.println("Enter the age of the employee");
		age    = sc.nextInt();
		
		System.out.println("Enter the salary of the employee");
		salary = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the Hometown of the employee");
		homeTown = sc.nextLine();
	}
	
	
	public void ShowData()
	{
	
		System.out.println("Name of the employee     = "+name);
		
		
		System.out.println("Age of the employee      = "+age );
		
		
		System.out.println("Salary of the employee   = "+salary);
		
		
		System.out.println("Hometown of the employee = "+homeTown);
	
	
	}
	
	
	boolean CheckAge(int d)
	{
		return age>d;
	
	}


}





class Question_7
{

	public static void main(String [] args)
	{
		
		Employee db[];
		
		System.out.println("Enter the nunber of employees");
		Scanner sc = new Scanner(System.in);
		int s      = sc.nextInt();
		db         = new Employee[s];
		
		for(int i =0;i<db.length;i++)
		{
			db[i] = new Employee();
			db[i].GetData();
		
		} 
		
		
		System.out.println("Employees whose age is greater than 25");
		
		for(Employee e : db)
		{
			if(e.CheckAge(25))
			{
				e.ShowData();
				
			}
		
		}
	}

}

























