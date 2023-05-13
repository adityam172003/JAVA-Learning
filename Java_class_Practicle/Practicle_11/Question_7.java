import java.awt.*;

import java.awt.event.*;


class MainFrame7 extends Frame
{	Point p;
	
	MainFrame7()
	{
		p = new Point();
		setSize(600,600);
		setTitle("Question 7");
		setLocationRelativeTo(null);
		
		
		this.addMouseListener(new MouseHandler7(this));
		
		setVisible(true);
	}
	
	
	public void paint(Graphics g)
	{
		String str = "Mouse clicked at ("+p.x+","+p.y+") position";
		
		g.setFont(new Font("Arial",Font.BOLD,30));
		
		g.drawString(str,150,150);
		
		// g.drawString(str,p.x,p.y); at clicked position it draws the string 
	}	
	
	
}

class MouseHandler7 extends MouseAdapter
{
	MainFrame7 fr;
	
	MouseHandler7(MainFrame7 f)
	{	
		fr = f;
	}
	
	public void mouseClicked(MouseEvent e)
	{
		fr.p = e.getPoint();
		fr.repaint();
	}	
}	


class Question_7
{
	public static void main(String [] args)
	{
		MainFrame7 f = new MainFrame7();
		
	}
}
