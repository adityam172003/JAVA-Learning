import java.awt.*;

import java.awt.event.*;


class MainFrame8 extends Frame
{	String str;
	
	MainFrame8()
	{	str = "--";
		
		setSize(600,600);
		setTitle("Question 8");
		setLocationRelativeTo(null);
		
		
		this.addMouseListener(new MouseHandler8(this));
		
		setVisible(true);
	}
	
	
	public void paint(Graphics g)
	{
		
		g.setFont(new Font("Arial",Font.BOLD,30));
		
		g.drawString(str,150,150);
	}	
	
	public void setString(int n)
	{
		if(n==1)
		{
			str ="LEFT BUTTON CLICKED";
			
		}
		else if(n==3)
		{
			str ="RIGHT BUTTON CLICKED";
		}
		this.repaint();
	}	
}

class MouseHandler8 extends MouseAdapter
{
	MainFrame8 fr;
	
	MouseHandler8(MainFrame8 f)
	{	
		fr = f;
	}
	
	public void mouseClicked(MouseEvent e)
	{
		
		fr.setString(e.getButton());
	}	
}	


class Question_8
{
	public static void main(String [] args)
	{
		MainFrame8 f = new MainFrame8();
		
	}
}
