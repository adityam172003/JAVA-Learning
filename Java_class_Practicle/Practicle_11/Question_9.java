import java.awt.*;
import java.awt.event.*;


class MainFrame9 extends Frame
{
	Color clr;
	MainFrame9()
	{	
		clr = Color.RED;
		
		setSize(600,600);
		setTitle("Question 9");
		setLocationRelativeTo(null);
		
		
		this.addMouseListener(new MouseHandler9(this));
		
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(clr);
		g.fillOval(150,150,400,400);
	}
	
	public void SetColor(int n)
	{
		if(n==1)
		{
			clr = Color.BLUE;
		}
		else
		{
			clr = Color.RED;
		}	
		
		this.repaint();
	}
	
}



class MouseHandler9 extends MouseAdapter
{
	
	MainFrame9 fr;
	
	MouseHandler9(MainFrame9 f)
	{
		fr  = f;
	}
	
	public void mouseClicked(MouseEvent e)
	{
		fr.SetColor(e.getButton());
	}
}


public class Question_9
{
	public static void main(String [] args)
	{	
		MainFrame9 f = new MainFrame9();
	}
}








