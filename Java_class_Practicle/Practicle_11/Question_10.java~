import java.awt.*;
import java.awt.event.*;



class MainFrame10 extends Frame
{
	Point p1;
	Point p2;	
	
	int x=0;	
	MainFrame10()
	{	p1 = new Point();
		p2 = new Point();
		
		setSize(600,600);
		setTitle("Question 10");
		setLocationRelativeTo(null);
		
		
		this.addMouseListener(new MouseHandler10(this));
		
		setVisible(true);
	}
	
	
	
	public void paint( Graphics g)
	{	
		int x1 ,y1 ,x2,y2;
		
		x1 = p1.x;
		y1 = p1.y;
		
		x2 = p2.x;
		y2 = p2.y;
		
		int len = x2-x1;
		if(y2<y1)len=-len;
		
		if(x1>x2)
		{
	
			int p =x2;
			int q =y2;
			
			x2=x1;
			y2=y1;
			
			x1=p;
			y1=q;	
		}
		
		
		int arrx[] = {x1 ,x2,x2,x1};
		
		int arry[] = {y1 ,y1,y1+len,y1+len};
	
		for(int i =0;i<4;i++)
		{	if(i<3)
			{
				g.drawLine(arrx[i],arry[i],arrx[i+1],arry[i+1]);
			}
			else
			{
			
				g.drawLine(arrx[i],arry[i],arrx[0],arry[0]);
			}
		}
		
	}
	
	
	public void setPoint(Point q)
	{
		if(x==0)
		{
			p1= q;
			x++;
		}
		else if(x==1)
		{
			p2 = q;
			
			this.repaint();
			x=0;
			p1=new Point();
		
		}
		
		
	}
}

class MouseHandler10 extends MouseAdapter
{
	MainFrame10 fr;
	
	MouseHandler10(MainFrame10 f)
	{
		fr = f;
	}
	
	public void mouseClicked(MouseEvent e)
	{
		fr.setPoint(e.getPoint());
	}
}

public class Question_10
{

	public static void main(String [] args)
	{
		MainFrame10 f = new MainFrame10();

	}	
}


