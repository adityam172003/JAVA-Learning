import java.util.*;
import java.awt.*;





class MainFrame11 extends Frame
{	int x,y;
	int r;

	MainFrame11( int x,int y,int r)
	{	this.x = x;
		this.y = y;
		this.r = r;
		setSize(600,600);
		setTitle("Question 11");
		setLocationRelativeTo(null);		
		setVisible(true);
	}
	
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillOval(x-r,y-r,2*r,2*r);
		
	}
}



class Question_11
{
	public static void main(String args[])
	{
		int x ;
		int y ;
		int r ;
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the center coordinates ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Enter the radius ");
		r = sc.nextInt();
		
		MainFrame11 f = new MainFrame11(x,y,r);
		
	}
}
