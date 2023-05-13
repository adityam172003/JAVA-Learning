import java.util.*;
import java.awt.*;





class MainFrame12 extends Frame
{	
	int r;

	MainFrame12(int r)
	{	
		this.r = r;
		setSize(600,600);
		setTitle("Question 11");
		setLocationRelativeTo(null);		
		setVisible(true);
	}
	
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		int x = this.getWidth()/2;
		int y = this.getHeight()/2;
		g.fillOval(x-r,y-r,2*r,2*r);
		
	}
}



class Question_12
{
	public static void main(String args[])
	{
		int r ;
		
		Scanner sc  = new Scanner(System.in);
		
	
		System.out.println("Enter the radius ");
		r = sc.nextInt();
		
		MainFrame12 f = new MainFrame12(r);
		
	}
}
