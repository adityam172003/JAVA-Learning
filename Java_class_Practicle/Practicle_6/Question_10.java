abstract class AbGrand
{
	int x;
	static{
	
		System.out.println("Static block of Abstract class");
		
	}
	
	abstract void Show();
	

	abstract void Print();
	
}



class Parent extends AbGrand
{
	void changeX()
	{
	
		System.out.println("Changing x  ");
		x=10;
	}
	
	void Show()
	{
		System.out.println("Show in Grand");
		System.out.println("x="+x);	
	}
	void Print()
	{
		System.out.println("in parent Print");
	}


}






class Question_10
{
	public static void main(String []args)
	{
		Parent p = new Parent();
		
		p.changeX();
		p.Show();
		p.Print();
	}

}









