
class Teacher
{
	private Info name;
	private Info homeTown;
	private Date bdate;
	private Date jdate;
	
        public  Teacher()
        {
        	name     = new Info();
        	homeTown = new Info();
        	bdate    = new Date();
        	jdate    = new Date();
        	
        }
	
	public void addT()
	{
		
		System.out.println("Enter the name of teacher");
		
		name.getString();
		
		System.out.println("Enter the home town of teacher");
		
		homeTown.getString();
		
		System.out.println("Enter the joining date ");
		
		jdate.getDate();
		
		System.out.println("Enter the birth date ");
		
		bdate.getDate();
		
		
	}
	
	public void showT()
	{
		System.out.println("Name of the teacher");
		name.showString();
		
		System.out.println("home town of teacher");
		homeTown.showString();
		
		System.out.println("Birth date of teacher");
		bdate.showDate();
		
		System.out.println("Joining date of teacher");
		jdate.showDate();
	}
	
	
	public int ageT(int year)
	{
		return bdate.getDiffer(year);
	
	}
	
	public boolean checkT(int i,char c)
	{
		
		if(c == name.getChar(i))
		{	
			return true;
		}
		
		return false;
	}
	

}
