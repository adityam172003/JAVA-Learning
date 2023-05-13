class Number
{
	int arr[];
	
	public Number()
	{
		arr = new int[100000000];
	}
	
	
	void finalze()
	{
		System.out.println("Called");
	}	
}



class Question_18
{
	public static void main(String [] ar)
	{
		int nq =10000;
		Number n[] = new Number[nq];
		for(int i =0;i<nq;i++)
		{
			System.out.println(i);
			n[i] = new Number();
			n[i]=null;
		}
	}
}

