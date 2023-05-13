interface Itr1
{
	int x=10;    // it is  a constant variable
	
	void Show();
	
	/*
		this declarations has same meaning 
		void Show();
		abstract void Show();
		abstract void Show();
	------> abstract public void Show();
		
	*/
	
	

}


interface Itr2
{
	int x=30;
	
	void print();
	

}


class Chilc implement Itr1,Itr2
{
	

}
