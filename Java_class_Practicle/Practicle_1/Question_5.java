import java.util.*;

class Question_5
{
	public static void main(String [] xyz)
	{
		/*
			Q 5 ] Scan Name,age and salary of an employee.If employee enters age less than 18, ask him 
			      to re-enter correct age.Keep asking until he/she enters correct age.If he enters 
			      negative salary,keep asking him to enter correct salary.Print the data.

		*/
		
		String name  ;
		int    salary;
		int    age   ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee name");
		name = sc.nextLine();
		
		System.out.println("Enter Employee age");
		age  = sc.nextInt();
		
		while(age<18)
		{
			System.out.println("Please enter the correct age ");
			age  = sc.nextInt();
		}
		
		System.out.println("Enter the Employee's salary");
		salary  = sc.nextInt();
		
		while(salary<=0)
		{
			System.out.println("Please enter the correct salary ");
			salary = sc.nextInt();
		
		}
		
		System.out.println("Emplyee Information"      );
		System.out.println("Name   : " + name         );
		System.out.println("age    : " + age +" year" );
		System.out.println("salary : Rs. " + salary   );  
		
		
		
	}




}
